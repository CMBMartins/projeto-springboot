
/*******************************************************
 * PROJETO SIMULADOR PARA TREINAMENTO DE OPERADORES DE *
 * SUBESTAÇAO.                                         *
 * PROJETISTA E DESENVOLVEDOR:                         *
 *          CARLOS MARDONIO BEZERRA MARTINS            * 
 *         BACHAREL EM SISTEMAS DE INFORMAÇAO          *
 *                                                     *
 * DATA - 18/08/2006                                   *
 * ATUALIZADO - 19/08/2008                            *
 *******************************************************
 * MODULO -   RELOGIO                                  *
 ******************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Relogio extends JFrame {
    JTextField tfData;
    JLabel lbTempo;
    JLabel lbTempo1;
    JLabel lbTitulo;
    JButton Sair;
    long t1 = 0;
    long t2 = 0;
    long t3 = 0;
    int passo = 0;
    long performance = 0;
    int manobra = 0;
    int quantpassos = 0;
    String rendimento = "0%";

    public Relogio() {
        setSize(170, 290);
        // setLocation(863, 368);
        setTitle("Medidor de Desempenho");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addWindowListener(new WindowAdapter() {

            public void windowClossing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        setResizable(false);

        JPanel painel = new JPanel();

        getContentPane().add(new ClockCanvas("                Contador", "GMT+0"));

        // t1 = Calendar.getInstance().getTimeInMillis();

        Date data = new Date();
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // somente a data em um objeto separado
        String date = formate.format(data); // variavel date recebe o conteudo do objeto data.
        tfData = new JTextField(date);
        // tfData.setEditable(false);
        // tfData.setFont(new Font("Dialog", Font.BOLD, 14));
        // tfData.setBackground(new Color(0,0,0));//cor de fundo do bot�o
        // tfData.setForeground(Color.yellow);
        // tfData.setBounds(2,175,148,30); //Coluna,Linha,Largura,Altura
        // getContentPane().add(tfData);

        lbTitulo = new JLabel(" Contador ");
        lbTitulo.setFont(new Font("Dialog", Font.BOLD, 14)); // setFont(new Font("Arial", 1, 14));
        lbTitulo.setForeground(Color.red);
        lbTitulo.setBounds(40, 20, 180, 30);
        getContentPane().add(lbTitulo);

        lbTempo = new JLabel("Performance: " + performance);
        lbTempo.setFont(new Font("Arial", 1, 14));
        lbTempo.setForeground(Color.red);
        lbTempo.setBounds(3, 130, 180, 30);
        getContentPane().add(lbTempo);

        lbTempo1 = new JLabel("Manobra:   " + rendimento);
        lbTempo1.setFont(new Font("Arial", 1, 14));
        lbTempo1.setForeground(Color.red);
        lbTempo1.setBounds(3, 160, 180, 30);
        getContentPane().add(lbTempo1);

        Sair = new JButton("Sair");
        Sair.setBackground(new Color(180, 180, 250));
        Sair.setBounds(2, 205, 148, 30); // Coluna,Linha,Largura,Altura
        Sair.setFont(new Font("Dialog", Font.BOLD, 24));
        getContentPane().add(Sair);

        c.add(painel);

        Sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
            }
        });
    }

    public void iniciaTempo() {
        t1 = Calendar.getInstance().getTimeInMillis();
    }

    public void atualizaTempo() {
        SimpleDateFormat formato = new SimpleDateFormat("mm:ss");
        t2 = Calendar.getInstance().getTimeInMillis();
        performance = (t2 - t1);
        lbTempo.setText("Performance: " + formato.format(performance));
        // lbTempo.setText("Performance: " +performance);
    }

    public void zeraOtempo() {
        performance = performance - performance;
        SimpleDateFormat formato = new SimpleDateFormat("mm:ss");
        lbTempo.setText("Performance: " + formato.format(performance));
    }

    public void rendimento() {
        manobra = passo * 100 / quantpassos;
        lbTempo1.setText("Manobra: " + manobra + "%");
    }

    interface TimerListener {
        void timeElapsed(Timer t);
    }

    class Timer extends Thread {
        private TimerListener target;
        private int interval;

        public Timer(int i, TimerListener t) {
            target = t;
            interval = i;
            setDaemon(true);
        }

        public void run() {
            try {
                while (!interrupted()) {
                    sleep(interval);
                    target.timeElapsed(this);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    class ClockCanvas extends JPanel implements TimerListener {
        private int seconds = 0;
        private String city;
        // private int offset;
        private GregorianCalendar calendar;

        public ClockCanvas(String c, String tz) {
            city = c;
            calendar = new GregorianCalendar(TimeZone.getTimeZone(tz));
            Timer t = new Timer(1000, this);
            t.start();
            setSize(140, 140);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(27, 20, 100, 100);
            double hourAngle = 2 * Math.PI * (seconds - 3 * 60 * 60) / (12 * 60 * 60);
            double minuteAngle = 2 * Math.PI * (seconds - 15 * 60) / (60 * 60);
            double secondAngle = 2 * Math.PI * (seconds - 15) / 60;
            g.drawLine(70, 70, 70 + (int) (30 * Math.cos(hourAngle)), 70 + (int) (30 * Math.sin(hourAngle)));
            g.drawLine(70, 70, 70 + (int) (40 * Math.cos(minuteAngle)), 70 + (int) (40 * Math.sin(minuteAngle)));
            g.drawLine(70, 70, 70 + (int) (45 * Math.cos(secondAngle)), 70 + (int) (45 * Math.sin(secondAngle)));
            g.drawString(city, 0, 13);
            atualizaData();
        }

        public void atualizaData() {
            Date data = new Date();
            SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss"); // somente a data em um objeto
                                                                                     // separado
            String date = formato.format(data);
            tfData.setText(date);
        }

        public void timeElapsed(Timer t) {
            calendar.setTime(new Date());
            seconds = calendar.get(Calendar.HOUR) * 60 * 60 +
                    calendar.get(Calendar.MINUTE) * 60 +
                    calendar.get(calendar.SECOND);
            repaint();
        }
    }

    public static void main(String[] args) {
        Frame f = new Relogio();
        f.setVisible(true);
    }
}