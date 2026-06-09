
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
 * MODULO -   EQUIPAMENTOS 34,5 Kv                     *
 ******************************************************/
import javax.swing.*;

public class Equipamentos345kV {
    // Barra T1
    private int Codigo = 0;
    private int QuantOperaçoes = 0;
    private String seccionadora89c1 = "Seccionadora Aberta";
    private String seccionadora89c1e = "Seccionadora Aberta";
    private String seccionadora89c2 = "Seccionadora Aberta";
    private String seccionadora89c2e = "Seccionadora Aberta";
    private String seccionadora89r6 = "Seccionadora Aberta";
    private String seccionadora89r6e = "Seccionadora Aberta";
    private String seccionadora89lvr1 = "Seccionadora Aberta";
    private String seccionadora89lvr1e = "Seccionadora Aberta";
    private String seccionadora89lvrr = "Seccionadora Aberta";
    private String seccionadora89lvrre = "Seccionadora Aberta";
    private String seccionadora89ta1 = "Seccionadora Aberta";
    private String seccionadora89tar = "Seccionadora Aberta";
    private String seccionadora89p1 = "Seccionadora Aberta";
    private String seccionadora89p1e = "Seccionadora Aberta";
    private String seccionadora89p2 = "Seccionadora Aberta";
    private String seccionadora89p2e = "Seccionadora Aberta";
    private String seccionadora89a2 = "Seccionadora Aberta";
    private String seccionadora89a2e = "Seccionadora Aberta";
    private String seccionadora89a1 = "Seccionadora Aberta";
    private String seccionadora89a1e = "Seccionadora Aberta";
    private String seccionadora89tu = "Seccionadora Aberta";
    private String seccionadora89tue = "Seccionadora Aberta";
    private String seccionadora89r5 = "Seccionadora Aberta";
    private String seccionadora89r5e = "Seccionadora Aberta";
    private String seccionadora89r4 = "Seccionadora Aberta";
    private String seccionadora89r4e = "Seccionadora Aberta";
    private String seccionadora89r3 = "Seccionadora Aberta";
    private String seccionadora89r3e = "Seccionadora Aberta";
    private String seccionadora89r2 = "Seccionadora Aberta";
    private String seccionadora89r2e = "Seccionadora Aberta";
    private String seccionadora89r1 = "Seccionadora Aberta";
    private String seccionadora89r1e = "Seccionadora Aberta";

    // Barra T2
    private String seccionadora89c3 = "Seccionadora Aberta";
    private String seccionadora89c3e = "Seccionadora Aberta";
    private String seccionadora89c4 = "Seccionadora Aberta";
    private String seccionadora89c4e = "Seccionadora Aberta";
    private String seccionadora89r7 = "Seccionadora Aberta";
    private String seccionadora89r7e = "Seccionadora Aberta";
    private String seccionadora89lvr2 = "Seccionadora Aberta";
    private String seccionadora89lvr2e = "Seccionadora Aberta";
    private String seccionadora89ta2 = "Seccionadora Aberta";
    private String seccionadora89p3 = "Seccionadora Aberta";
    private String seccionadora89p3e = "Seccionadora Aberta";
    private String seccionadora89a3 = "Seccionadora Aberta";
    private String seccionadora89a3e = "Seccionadora Aberta";
    private String seccionadora89a4 = "Seccionadora Aberta";
    private String seccionadora89a4e = "Seccionadora Aberta";
    private String seccionadora89r12 = "Seccionadora Aberta";
    private String seccionadora89r12e = "Seccionadora Aberta";
    private String seccionadora89r11 = "Seccionadora Aberta";
    private String seccionadora89r11e = "Seccionadora Aberta";
    private String seccionadora89r10 = "Seccionadora Aberta";
    private String seccionadora89r10e = "Seccionadora Aberta";
    private String seccionadora89r9 = "Seccionadora Aberta";
    private String seccionadora89r9e = "Seccionadora Aberta";
    private String seccionadora89r8 = "Seccionadora Aberta";
    private String seccionadora89r8e = "Seccionadora Aberta";

    // Barra T3
    private String seccionadora89c5 = "Seccionadora Aberta";
    private String seccionadora89c5e = "Seccionadora Aberta";
    private String seccionadora89c6 = "Seccionadora Aberta";
    private String seccionadora89c6e = "Seccionadora Aberta";
    private String seccionadora89r13 = "Seccionadora Aberta";
    private String seccionadora89r13e = "Seccionadora Aberta";
    private String seccionadora89lvr3 = "Seccionadora Aberta";
    private String seccionadora89lvr3e = "Seccionadora Aberta";
    private String seccionadora89ta3 = "Seccionadora Aberta";
    private String seccionadora89p4 = "Seccionadora Aberta";
    private String seccionadora89p4e = "Seccionadora Aberta";
    private String seccionadora89p5 = "Seccionadora Aberta";
    private String seccionadora89p5e = "Seccionadora Aberta";
    private String seccionadora89a5 = "Seccionadora Aberta";
    private String seccionadora89a5e = "Seccionadora Aberta";
    private String seccionadora89a6 = "Seccionadora Aberta";
    private String seccionadora89a6e = "Seccionadora Aberta";
    private String seccionadora89r18 = "Seccionadora Aberta";
    private String seccionadora89r18e = "Seccionadora Aberta";
    private String seccionadora89r17 = "Seccionadora Aberta";
    private String seccionadora89r17e = "Seccionadora Aberta";
    private String seccionadora89r16 = "Seccionadora Aberta";
    private String seccionadora89r16e = "Seccionadora Aberta";
    private String seccionadora89r15 = "Seccionadora Aberta";
    private String seccionadora89r15e = "Seccionadora Aberta";
    private String seccionadora89r14 = "Seccionadora Aberta";
    private String seccionadora89r14e = "Seccionadora Aberta";

    // Barra T4
    private String seccionadora89c7 = "Seccionadora Aberta";
    private String seccionadora89c7e = "Seccionadora Aberta";
    private String seccionadora89c8 = "Seccionadora Aberta";
    private String seccionadora89c8e = "Seccionadora Aberta";
    private String seccionadora89r19 = "Seccionadora Aberta";
    private String seccionadora89r19e = "Seccionadora Aberta";
    private String seccionadora89lvr4 = "Seccionadora Aberta";
    private String seccionadora89lvr4e = "Seccionadora Aberta";
    private String seccionadora89ta4 = "Seccionadora Aberta";
    private String seccionadora89p6 = "Seccionadora Aberta";
    private String seccionadora89p6e = "Seccionadora Aberta";
    private String seccionadora89a7 = "Seccionadora Aberta";
    private String seccionadora89a7e = "Seccionadora Aberta";
    private String seccionadora89a8 = "Seccionadora Aberta";
    private String seccionadora89a8e = "Seccionadora Aberta";
    private String seccionadora89r20 = "Seccionadora Aberta";
    private String seccionadora89r20e = "Seccionadora Aberta";
    private String seccionadora89r21 = "Seccionadora Aberta";
    private String seccionadora89r21e = "Seccionadora Aberta";
    private String seccionadora89r22 = "Seccionadora Aberta";
    private String seccionadora89r22e = "Seccionadora Aberta";
    private String seccionadora89r23 = "Seccionadora Aberta";
    private String seccionadora89r23e = "Seccionadora Aberta";
    private String seccionadora89r24 = "Seccionadora Aberta";
    private String seccionadora89r24e = "Seccionadora Aberta";
    private String seccionadora89ta8 = "Seccionadora Aberta";

    // Barras
    private int QuantFechamento89c1 = 0;
    private int QuantFechamento89c1e = 0;
    private int QuantFechamento89c2 = 0;
    private int QuantFechamento89c2e = 0;
    private int QuantFechamento89c3 = 0;
    private int QuantFechamento89c3e = 0;
    private int QuantFechamento89c4 = 0;
    private int QuantFechamento89c4e = 0;
    private int QuantFechamento89c5 = 0;
    private int QuantFechamento89c5e = 0;
    private int QuantFechamento89c6 = 0;
    private int QuantFechamento89c6e = 0;
    private int QuantFechamento89c7 = 0;
    private int QuantFechamento89c7e = 0;
    private int QuantFechamento89c8 = 0;
    private int QuantFechamento89c8e = 0;
    private int QuantFechamento89r6 = 0;
    private int QuantFechamento89r6e = 0;
    private int QuantFechamento89lvr1 = 0;
    private int QuantFechamento89lvr1e = 0;
    private int QuantFechamento89lvr2 = 0;
    private int QuantFechamento89lvr2e = 0;
    private int QuantFechamento89lvr3 = 0;
    private int QuantFechamento89lvr3e = 0;
    private int QuantFechamento89lvr4 = 0;
    private int QuantFechamento89lvr4e = 0;
    private int QuantFechamento89p1 = 0;
    private int QuantFechamento89p1e = 0;
    private int QuantFechamento89p2 = 0;
    private int QuantFechamento89p2e = 0;
    private int QuantFechamento89p3 = 0;
    private int QuantFechamento89p3e = 0;
    private int QuantFechamento89p4 = 0;
    private int QuantFechamento89p4e = 0;
    private int QuantFechamento89p5 = 0;
    private int QuantFechamento89p5e = 0;
    private int QuantFechamento89p6 = 0;
    private int QuantFechamento89p6e = 0;
    private int QuantFechamento89r5 = 0;
    private int QuantFechamento89r5e = 0;
    private int QuantFechamento89r4 = 0;
    private int QuantFechamento89r4e = 0;
    private int QuantFechamento89r3 = 0;
    private int QuantFechamento89r3e = 0;
    private int QuantFechamento89r2 = 0;
    private int QuantFechamento89r2e = 0;
    private int QuantFechamento89r1 = 0;
    private int QuantFechamento89r1e = 0;
    private int QuantFechamento89r13 = 0;
    private int QuantFechamento89r13e = 0;
    private int QuantFechamento89r14 = 0;
    private int QuantFechamento89r14e = 0;
    private int QuantFechamento89r15 = 0;
    private int QuantFechamento89r15e = 0;
    private int QuantFechamento89r16 = 0;
    private int QuantFechamento89r16e = 0;
    private int QuantFechamento89r17 = 0;
    private int QuantFechamento89r17e = 0;
    private int QuantFechamento89r18 = 0;
    private int QuantFechamento89r18e = 0;
    private int QuantFechamento89r19 = 0;
    private int QuantFechamento89r19e = 0;
    private int QuantFechamento89r20 = 0;
    private int QuantFechamento89r20e = 0;
    private int QuantFechamento89r21 = 0;
    private int QuantFechamento89r21e = 0;
    private int QuantFechamento89r22 = 0;
    private int QuantFechamento89r22e = 0;
    private int QuantFechamento89r23 = 0;
    private int QuantFechamento89r23e = 0;
    private int QuantFechamento89r24 = 0;
    private int QuantFechamento89r24e = 0;

    private int QuantAbertura89c1 = 0;
    private int QuantAbertura89c2 = 0;
    private int QuantAbertura89c3 = 0;
    private int QuantAbertura89c4 = 0;
    private int QuantAbertura89c5 = 0;
    private int QuantAbertura89c6 = 0;
    private int QuantAbertura89c7 = 0;
    private int QuantAbertura89c8 = 0;
    private int QuantAbertura89r6 = 0;
    private int QuantAbertura89lvr1 = 0;
    private int QuantAbertura89p2 = 0;
    private int QuantAbertura89p2e = 0;
    private int QuantAbertura89p1 = 0;
    private int QuantAbertura89p1e = 0;
    private int QuantAbertura89p3 = 0;
    private int QuantAbertura89p3e = 0;
    private int QuantAbertura89p4 = 0;
    private int QuantAbertura89p4e = 0;
    private int QuantAbertura89p5 = 0;
    private int QuantAbertura89p5e = 0;
    private int QuantAbertura89p6 = 0;
    private int QuantAbertura89p6e = 0;
    private int QuantAbertura89r5 = 0;
    private int QuantAbertura89r5e = 0;
    private int QuantAbertura89r4 = 0;
    private int QuantAbertura89r4e = 0;
    private int QuantAbertura89r3 = 0;
    private int QuantAbertura89r3e = 0;
    private int QuantAbertura89r2 = 0;
    private int QuantAbertura89r2e = 0;
    private int QuantAbertura89r1 = 0;
    private int QuantAbertura89r1e = 0;
    private int QuantAbertura89r13 = 0;
    private int QuantAbertura89r13e = 0;
    private int QuantAbertura89r14 = 0;
    private int QuantAbertura89r14e = 0;
    private int QuantAbertura89r15 = 0;
    private int QuantAbertura89r15e = 0;
    private int QuantAbertura89r16 = 0;
    private int QuantAbertura89r16e = 0;
    private int QuantAbertura89r17 = 0;
    private int QuantAbertura89r17e = 0;
    private int QuantAbertura89r18 = 0;
    private int QuantAbertura89r18e = 0;
    private int QuantAbertura89r19 = 0;
    private int QuantAbertura89r20e = 0;
    private int QuantAbertura89r21 = 0;
    private int QuantAbertura89r21e = 0;
    private int QuantAbertura89r22 = 0;
    private int QuantAbertura89r22e = 0;
    private int QuantAbertura89r23 = 0;
    private int QuantAbertura89r23e = 0;
    private int QuantAbertura89r24 = 0;
    private int QuantAbertura89r24e = 0;

    // Barra T1
    private String NomeSeccionadora89c1 = "";
    private String ManobraSeccionadora89c1 = "";
    private String DataSeccionadora89c1 = "";
    private String NomeSeccionadora89c1e = "";
    private String ManobraSeccionadora89c1e = "";
    private String DataSeccionadora89c1e = "";
    private String NomeSeccionadora89c2 = "";
    private String ManobraSeccionadora89c2 = "";
    private String DataSeccionadora89c2 = "";
    private String NomeSeccionadora89c2e = "";
    private String ManobraSeccionadora89c2e = "";
    private String DataSeccionadora89c2e = "";
    private String NomeSeccionadora89r6 = "";
    private String ManobraSeccionadora89r6 = "";
    private String DataSeccionadora89r6 = "";
    private String NomeSeccionadora89r6e = "";
    private String ManobraSeccionadora89r6e = "";
    private String DataSeccionadora89r6e = "";
    private String NomeSeccionadora89lvr1 = "";
    private String ManobraSeccionadora89lvr1 = "";
    private String DataSeccionadora89lvr1 = "";
    private String NomeSeccionadora89lvr1e = "";
    private String ManobraSeccionadora89lvr1e = "";
    private String DataSeccionadora89lvr1e = "";
    private String NomeSeccionadora89p1 = "";
    private String ManobraSeccionadora89p1 = "";
    private String DataSeccionadora89p1 = "";
    private String NomeSeccionadora89p1e = "";
    private String ManobraSeccionadora89p1e = "";
    private String DataSeccionadora89p1e = "";
    private String NomeSeccionadora89p2 = "";
    private String ManobraSeccionadora89p2 = "";
    private String DataSeccionadora89p2 = "";
    private String NomeSeccionadora89p2e = "";
    private String ManobraSeccionadora89p2e = "";
    private String DataSeccionadora89p2e = "";
    private String NomeSeccionadora89r5 = "";
    private String ManobraSeccionadora89r5 = "";
    private String DataSeccionadora89r5 = "";
    private String NomeSeccionadora89r5e = "";
    private String ManobraSeccionadora89r5e = "";
    private String DataSeccionadora89r5e = "";
    private String NomeSeccionadora89r4 = "";
    private String ManobraSeccionadora89r4 = "";
    private String DataSeccionadora89r4 = "";
    private String NomeSeccionadora89r4e = "";
    private String ManobraSeccionadora89r4e = "";
    private String DataSeccionadora89r4e = "";
    private String NomeSeccionadora89r3 = "";
    private String ManobraSeccionadora89r3 = "";
    private String DataSeccionadora89r3 = "";
    private String NomeSeccionadora89r3e = "";
    private String ManobraSeccionadora89r3e = "";
    private String DataSeccionadora89r3e = "";
    private String NomeSeccionadora89r2 = "";
    private String ManobraSeccionadora89r2 = "";
    private String DataSeccionadora89r2 = "";
    private String NomeSeccionadora89r2e = "";
    private String ManobraSeccionadora89r2e = "";
    private String DataSeccionadora89r2e = "";
    private String NomeSeccionadora89r1 = "";
    private String ManobraSeccionadora89r1 = "";
    private String DataSeccionadora89r1 = "";
    private String NomeSeccionadora89r1e = "";
    private String ManobraSeccionadora89r1e = "";
    private String DataSeccionadora89r1e = "";

    private String disjuntor52c1 = "Disjuntor Aberto";
    private String disjuntor52c2 = "Disjuntor Aberto";
    private String disjuntor52r6 = "Disjuntor Aberto";
    private String disjuntor52lvr1 = "Disjuntor Aberto";
    private String disjuntor52lvrr = "Disjuntor Aberto";
    private String disjuntor52p1 = "Disjuntor Aberto";
    private String disjuntor52p2 = "Disjuntor Aberto";
    private String disjuntor52a2 = "Disjuntor Aberto";
    private String disjuntor52a1 = "Disjuntor Aberto";
    private String disjuntor52tu = "Disjuntor Aberto";
    private String disjuntor52g2 = "Disjuntor Aberto";
    private String disjuntor52g1 = "Disjuntor Aberto";
    private String disjuntor52r5 = "Disjuntor Aberto";
    private String disjuntor52r4 = "Disjuntor Aberto";
    private String disjuntor52r3 = "Disjuntor Aberto";
    private String disjuntor52r2 = "Disjuntor Aberto";
    private String disjuntor52r1 = "Disjuntor Aberto";
    private String NomeDisjuntor52c1 = "";
    private String ManobraDisjuntor52c1 = "";
    private String DataDisjuntor52c1 = "";
    private String NomeDisjuntor52c2 = "";
    private String ManobraDisjuntor52c2 = "";
    private String DataDisjuntor52c2 = "";
    private String NomeDisjuntor52r6 = "";
    private String ManobraDisjuntor52r6 = "";
    private String DataDisjuntor52r6 = "";
    private String NomeDisjuntor52lvr1 = "";
    private String ManobraDisjuntor52lvr1 = "";
    private String DataDisjuntor52lvr1 = "";
    private String NomeDisjuntor52p1 = "";
    private String ManobraDisjuntor52p1 = "";
    private String DataDisjuntor52p1 = "";
    private String NomeDisjuntor52p2 = "";
    private String ManobraDisjuntor52p2 = "";
    private String DataDisjuntor52p2 = "";
    private String NomeDisjuntor52r5 = "";
    private String ManobraDisjuntor52r5 = "";
    private String DataDisjuntor52r5 = "";
    private String NomeDisjuntor52r4 = "";
    private String ManobraDisjuntor52r4 = "";
    private String DataDisjuntor52r4 = "";
    private String NomeDisjuntor52r3 = "";
    private String ManobraDisjuntor52r3 = "";
    private String DataDisjuntor52r3 = "";
    private String NomeDisjuntor52r2 = "";
    private String ManobraDisjuntor52r2 = "";
    private String DataDisjuntor52r2 = "";
    private String NomeDisjuntor52r1 = "";
    private String ManobraDisjuntor52r1 = "";
    private String DataDisjuntor52r1 = "";

    // BARRA T2
    private String disjuntor52c3 = "Disjuntor Aberto";
    private String disjuntor52c4 = "Disjuntor Aberto";
    private String disjuntor52r7 = "Disjuntor Aberto";
    private String disjuntor52lvr2 = "Disjuntor Aberto";
    private String disjuntor52p3 = "Disjuntor Aberto";
    private String disjuntor52a3 = "Disjuntor Aberto";
    private String disjuntor52a4 = "Disjuntor Aberto";
    private String disjuntor52r12 = "Disjuntor Aberto";
    private String disjuntor52r11 = "Disjuntor Aberto";
    private String disjuntor52r10 = "Disjuntor Aberto";
    private String disjuntor52r9 = "Disjuntor Aberto";
    private String disjuntor52r8 = "Disjuntor Aberto";

    // BARRA T3
    private String disjuntor52c5 = "Disjuntor Aberto";
    private String disjuntor52c6 = "Disjuntor Aberto";
    private String disjuntor52r13 = "Disjuntor Aberto";
    private String disjuntor52lvr3 = "Disjuntor Aberto";
    private String disjuntor52p4 = "Disjuntor Aberto";
    private String disjuntor52p5 = "Disjuntor Aberto";
    private String disjuntor52a5 = "Disjuntor Aberto";
    private String disjuntor52a6 = "Disjuntor Aberto";
    private String disjuntor52r18 = "Disjuntor Aberto";
    private String disjuntor52r17 = "Disjuntor Aberto";
    private String disjuntor52r16 = "Disjuntor Aberto";
    private String disjuntor52r15 = "Disjuntor Aberto";
    private String disjuntor52r14 = "Disjuntor Aberto";

    // BARRA T4
    private String NomeSeccionadora89c7 = "";
    private String ManobraSeccionadora89c7 = "";
    private String DataSeccionadora89c7 = "";
    private String NomeSeccionadora89c7e = "";
    private String ManobraSeccionadora89c7e = "";
    private String DataSeccionadora89c7e = "";
    private String NomeSeccionadora89c8 = "";
    private String ManobraSeccionadora89c8 = "";
    private String DataSeccionadora89c8 = "";
    private String NomeSeccionadora89c8e = "";
    private String ManobraSeccionadora89c8e = "";
    private String DataSeccionadora89c8e = "";
    private String NomeSeccionadora89r19 = "";
    private String ManobraSeccionadora89r19 = "";
    private String DataSeccionadora89r19 = "";
    private String NomeSeccionadora89r19e = "";
    private String ManobraSeccionadora89r19e = "";
    private String DataSeccionadora89r19e = "";
    private String NomeSeccionadora89lvr4 = "";
    private String ManobraSeccionadora89lvr4 = "";
    private String DataSeccionadora89lvr4 = "";
    private String NomeSeccionadora89lvr4e = "";
    private String ManobraSeccionadora89lvr4e = "";
    private String DataSeccionadora89lvr4e = "";
    private String NomeSeccionadora89p6 = "";
    private String ManobraSeccionadora89p6 = "";
    private String DataSeccionadora89p6 = "";
    private String NomeSeccionadora89p6e = "";
    private String ManobraSeccionadora89p6e = "";
    private String DataSeccionadora89p6e = "";
    private String NomeSeccionadora89r20 = "";
    private String ManobraSeccionadora89r20 = "";
    private String DataSeccionadora89r20 = "";
    private String NomeSeccionadora89r20e = "";
    private String ManobraSeccionadora89r20e = "";
    private String DataSeccionadora89r20e = "";
    private String NomeSeccionadora89r21 = "";
    private String ManobraSeccionadora89r21 = "";
    private String DataSeccionadora89r21 = "";
    private String NomeSeccionadora89r21e = "";
    private String ManobraSeccionadora89r21e = "";
    private String DataSeccionadora89r21e = "";
    private String NomeSeccionadora89r22 = "";
    private String ManobraSeccionadora89r22 = "";
    private String DataSeccionadora89r22 = "";
    private String NomeSeccionadora89r22e = "";
    private String ManobraSeccionadora89r22e = "";
    private String DataSeccionadora89r22e = "";
    private String NomeSeccionadora89r23 = "";
    private String ManobraSeccionadora89r23 = "";
    private String DataSeccionadora89r23 = "";
    private String NomeSeccionadora89r23e = "";
    private String ManobraSeccionadora89r23e = "";
    private String DataSeccionadora89r23e = "";
    private String NomeSeccionadora89r24 = "";
    private String ManobraSeccionadora89r24 = "";
    private String DataSeccionadora89r24 = "";
    private String NomeSeccionadora89r24e = "";
    private String ManobraSeccionadora89r24e = "";
    private String DataSeccionadora89r24e = "";
    private String NomeDisjuntor52c7 = "";
    private String ManobraDisjuntor52c7 = "";
    private String DataDisjuntor52c7 = "";
    private String NomeDisjuntor52c8 = "";
    private String ManobraDisjuntor52c8 = "";
    private String DataDisjuntor52c8 = "";
    private String NomeDisjuntor52r24 = "";
    private String ManobraDisjuntor52r24 = "";
    private String ManobraDisjuntor52r23 = "";
    private String DataDisjuntor52r24 = "";
    private String NomeDisjuntor52lvr4 = "";
    private String ManobraDisjuntor52lvr4 = "";
    private String DataDisjuntor52lvr4 = "";
    private String NomeDisjuntor52p6 = "";
    private String ManobraDisjuntor52p6 = "";
    private String DataDisjuntor52p6 = "";
    private String NomeDisjuntor52r23 = "";
    private String DataDisjuntor52r23 = "";
    private String NomeDisjuntor52r22 = "";
    private String ManobraDisjuntor52r22 = "";
    private String DataDisjuntor52r22 = "";
    private String NomeDisjuntor52r21 = "";
    private String ManobraDisjuntor52r21 = "";
    private String DataDisjuntor52r20 = "";
    private String NomeDisjuntor52r20 = "";
    private String ManobraDisjuntor52r20 = "";
    private String NomeDisjuntor52r19 = "";
    private String ManobraDisjuntor52r19 = "";
    private String DataDisjuntor52r19 = "";

    private String disjuntor52c7 = "Disjuntor Aberto";
    private String disjuntor52c8 = "Disjuntor Aberto";
    private String disjuntor52r19 = "Disjuntor Aberto";
    private String disjuntor52lvr4 = "Disjuntor Aberto";
    private String disjuntor52p6 = "Disjuntor Aberto";
    private String disjuntor52a7 = "Disjuntor Aberto";
    private String disjuntor52a8 = "Disjuntor Aberto";
    private String disjuntor52r24 = "Disjuntor Aberto";
    private String disjuntor52r23 = "Disjuntor Aberto";
    private String disjuntor52r22 = "Disjuntor Aberto";
    private String disjuntor52r21 = "Disjuntor Aberto";
    private String disjuntor52r20 = "Disjuntor Aberto";

    // Barra T1
    private int QuantFechamento52c1 = 0;
    private int QuantFechamento52c2 = 0;
    private int QuantFechamento52c3 = 0;
    private int QuantFechamento52c4 = 0;
    private int QuantFechamento52r6 = 0;
    private int QuantFechamento52lvr1 = 0;
    private int QuantFechamento52p1 = 0;
    private int QuantFechamento52p2 = 0;
    private int QuantFechamento52r5 = 0;
    private int QuantFechamento52r4 = 0;
    private int QuantAbertura52r3 = 0;
    private int QuantAbertura52r2 = 0;
    private int QuantAbertura52r1 = 0;
    private int QuantAbertura52c1 = 0;
    private int QuantAbertura52c2 = 0;

    // Barra T2
    private int QuantAbertura52c3 = 0;
    private int QuantAbertura52c4 = 0;
    private int QuantAbertura52r6 = 0;
    private int QuantAbertura52lvr1 = 0;
    private int QuantAbertura52p1 = 0;
    private int QuantAbertura52p2 = 0;
    private int QuantAbertura52r5 = 0;
    private int QuantAbertura52r4 = 0;

    // Barra T4
    private int QuantFechamento52c7 = 0;
    private int QuantFechamento52c8 = 0;
    private int QuantFechamento52r19 = 0;
    private int QuantFechamento52r20 = 0;
    private int QuantFechamento52r21 = 0;
    private int QuantFechamento52r22 = 0;
    private int QuantFechamento52r23 = 0;
    private int QuantFechamento52r24 = 0;
    private int QuantFechamento52lvr4 = 0;
    private int QuantAbertura52c7 = 0;
    private int QuantAbertura52c8 = 0;
    private int QuantAbertura52r19 = 0;
    private int QuantAbertura52lvr4 = 0;
    private int QuantAbertura52p6 = 0;
    private int QuantAbertura52r20 = 0;
    private int QuantAbertura52r21 = 0;
    private int QuantAbertura52r22 = 0;
    private int QuantAbertura52r23 = 0;
    private int QuantAbertura52r24 = 0;

    // Demais Barras
    private String transformadorlvr1 = "";
    private String transformadorlvrr = "";
    private String transformadorlvr1a = "";
    private String transformadorlvr2 = "";
    private String transformadorlvr2a = "";
    private String transformadorlvr3 = "";
    private String transformadorlvr3a = "";
    private String transformadorlvr43 = "";
    private String transformadorlvr4a = "";
    private String NomeTransformadorlvr1 = "";
    private String ManobraTransformadorlvr1 = "";
    private String DataTransformadorlvr1 = "";
    private String NomeTransformadorlvr1a = "";
    private String ManobraTransformadorlvr1a = "";
    private String DataTransformadorlvr1a = "";
    private String NomeTransformadorlvr2 = "";
    private String ManobraTransformadorlvr2 = "";
    private String DataTransformadorlvr2 = "";
    private String NomeTransformadorlvr2a = "";
    private String ManobraTransformadorlvr2a = "";
    private String DataTransformadorlvr2a = "";
    private String NomeTransformadorlvr3 = "";
    private String ManobraTransformadorlvr3 = "";
    private String NomeTransformadorlvr4 = "";
    private String ManobraTransformadorlvr4 = "";
    private String DataTransformadorlvr3 = "";
    private String NomeTransformadorlvr3a = "";
    private String DataTransformadorlvr4 = "";
    private String NomeTransformadorlvr4a = "";
    private String ManobraTransformadorlvr3a = "";
    private String DataTransformadorlvr3a = "";
    private String ManobraTransformadorlvr4a = "";
    private String DataTransformadorlvr4a = "";

    private String Usuario, Data;

    public Equipamentos345kV() {
    }

    public void setCodigo() {
        Codigo = Codigo + 1;
    }

    public int getCodigo() {
        return Codigo;
    }

    // ������������������ Seccionadoras Barra T1 ����������������
    public void fecharSeccionadora89c1() {
        if (seccionadora89c1.equals("Seccionadora Aberta"))
            seccionadora89c1 = "Seccionadora Fechada";
        else if (seccionadora89c1.equals("Seccionadora Fechada"))
            seccionadora89c1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c1() {
        if (seccionadora89c1.equals("Seccionadora Fechada"))
            seccionadora89c1 = "Seccionadora Aberta";
        else if (seccionadora89c1.equals("Seccionadora Aberta"))
            seccionadora89c1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c1e() {
        if (seccionadora89c1e.equals("Seccionadora Aberta"))
            seccionadora89c1e = "Seccionadora Fechada";
        else if (seccionadora89c1e.equals("Seccionadora Fechada"))
            seccionadora89c1e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c1e() {
        if (seccionadora89c1e.equals("Seccionadora Fechada"))
            seccionadora89c1e = "Seccionadora Aberta";
        else if (seccionadora89c1e.equals("Seccionadora Aberta"))
            seccionadora89c1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c2() {
        if (seccionadora89c2.equals("Seccionadora Aberta"))
            seccionadora89c2 = "Seccionadora Fechada";
        else if (seccionadora89c2.equals("Seccionadora Fechada"))
            seccionadora89c2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c2() {
        if (seccionadora89c2.equals("Seccionadora Fechada"))
            seccionadora89c2 = "Seccionadora Aberta";
        else if (seccionadora89c2.equals("Seccionadora Aberta"))
            seccionadora89c2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c2e() {
        if (seccionadora89c2e.equals("Seccionadora Aberta"))
            seccionadora89c2e = "Seccionadora Fechada";
        else if (seccionadora89c2e.equals("Seccionadora Fechada"))
            seccionadora89c2e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c2e() {
        if (seccionadora89c2e.equals("Seccionadora Fechada"))
            seccionadora89c2e = "Seccionadora Aberta";
        else if (seccionadora89c2e.equals("Seccionadora Aberta"))
            seccionadora89c2e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r6() {
        if (seccionadora89r6.equals("Seccionadora Aberta"))
            seccionadora89r6 = "Seccionadora Fechada";
        else if (seccionadora89r6.equals("Seccionadora Fechada"))
            seccionadora89r6 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r6() {
        if (seccionadora89r6.equals("Seccionadora Fechada"))
            seccionadora89r6 = "Seccionadora Aberta";
        else if (seccionadora89r6.equals("Seccionadora Aberta"))
            seccionadora89r6 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r6e() {
        if (seccionadora89r6e.equals("Seccionadora Aberta"))
            seccionadora89r6e = "Seccionadora Fechada";
        else if (seccionadora89r6e.equals("Seccionadora Fechada"))
            seccionadora89r6e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r6e() {
        if (seccionadora89r6e.equals("Seccionadora Fechada"))
            seccionadora89r6e = "Seccionadora Aberta";
        else if (seccionadora89r6e.equals("Seccionadora Aberta"))
            seccionadora89r6e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr1() {
        if (seccionadora89lvr1.equals("Seccionadora Aberta"))
            seccionadora89lvr1 = "Seccionadora Fechada";
        else if (seccionadora89lvr1.equals("Seccionadora Fechada"))
            seccionadora89lvr1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr1() {
        if (seccionadora89lvr1.equals("Seccionadora Fechada"))
            seccionadora89lvr1 = "Seccionadora Aberta";
        else if (seccionadora89lvr1.equals("Seccionadora Aberta"))
            seccionadora89lvr1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr1e() {
        if (seccionadora89lvr1e.equals("Seccionadora Aberta"))
            seccionadora89lvr1e = "Seccionadora Fechada";
        else if (seccionadora89lvr1e.equals("Seccionadora Fechada"))
            seccionadora89lvr1e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr1e() {
        if (seccionadora89lvr1e.equals("Seccionadora Fechada"))
            seccionadora89lvr1e = "Seccionadora Aberta";
        else if (seccionadora89lvr1e.equals("Seccionadora Aberta"))
            seccionadora89lvr1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89ta1() {
        if (seccionadora89ta1.equals("Seccionadora Aberta"))
            seccionadora89ta1 = "Seccionadora Fechada";
        else if (seccionadora89ta1.equals("Seccionadora Fechada"))
            seccionadora89ta1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89ta1() {
        if (seccionadora89ta1.equals("Seccionadora Fechada"))
            seccionadora89ta1 = "Seccionadora Aberta";
        else if (seccionadora89ta1.equals("Seccionadora Aberta"))
            seccionadora89ta1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvrr() {
        if (seccionadora89lvrr.equals("Seccionadora Aberta"))
            seccionadora89lvrr = "Seccionadora Fechada";
        else if (seccionadora89lvrr.equals("Seccionadora Fechada"))
            seccionadora89lvrr = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvrr() {
        if (seccionadora89lvrr.equals("Seccionadora Fechada"))
            seccionadora89lvrr = "Seccionadora Aberta";
        else if (seccionadora89lvrr.equals("Seccionadora Aberta"))
            seccionadora89lvrr = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvrre() {
        if (seccionadora89lvrre.equals("Seccionadora Aberta"))
            seccionadora89lvrre = "Seccionadora Fechada";
        else if (seccionadora89lvrre.equals("Seccionadora Fechada"))
            seccionadora89lvrre = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvrre() {
        if (seccionadora89lvrre.equals("Seccionadora Fechada"))
            seccionadora89lvrre = "Seccionadora Aberta";
        else if (seccionadora89lvrre.equals("Seccionadora Aberta"))
            seccionadora89lvr1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89tar() {
        if (seccionadora89tar.equals("Seccionadora Aberta"))
            seccionadora89tar = "Seccionadora Fechada";
        else if (seccionadora89tar.equals("Seccionadora Fechada"))
            seccionadora89tar = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89tar() {
        if (seccionadora89tar.equals("Seccionadora Fechada"))
            seccionadora89tar = "Seccionadora Aberta";
        else if (seccionadora89tar.equals("Seccionadora Aberta"))
            seccionadora89tar = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p1() {
        if (seccionadora89p1.equals("Seccionadora Aberta"))
            seccionadora89p1 = "Seccionadora Fechada";
        else if (seccionadora89p1.equals("Seccionadora Fechada"))
            seccionadora89p1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p1() {
        if (seccionadora89p1.equals("Seccionadora Fechada"))
            seccionadora89p1 = "Seccionadora Aberta";
        else if (seccionadora89p1.equals("Seccionadora Aberta"))
            seccionadora89p1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p1e() {
        if (seccionadora89p1e.equals("Seccionadora Aberta"))
            seccionadora89p1e = "Seccionadora Fechada";
        else if (seccionadora89p1e.equals("Seccionadora Fechada"))
            seccionadora89p1e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p1e() {
        if (seccionadora89p1e.equals("Seccionadora Fechada"))
            seccionadora89p1e = "Seccionadora Aberta";
        else if (seccionadora89p1e.equals("Seccionadora Aberta"))
            seccionadora89p1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p2() {
        if (seccionadora89p2.equals("Seccionadora Aberta"))
            seccionadora89p2 = "Seccionadora Fechada";
        else if (seccionadora89p2.equals("Seccionadora Fechada"))
            seccionadora89p2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p2() {
        if (seccionadora89p2.equals("Seccionadora Fechada"))
            seccionadora89p2 = "Seccionadora Aberta";
        else if (seccionadora89p2.equals("Seccionadora Aberta"))
            seccionadora89p2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p2e() {
        if (seccionadora89p2e.equals("Seccionadora Aberta"))
            seccionadora89p2e = "Seccionadora Fechada";
        else if (seccionadora89p2e.equals("Seccionadora Fechada"))
            seccionadora89p2e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p2e() {
        if (seccionadora89p2e.equals("Seccionadora Fechada"))
            seccionadora89p2e = "Seccionadora Aberta";
        else if (seccionadora89p2e.equals("Seccionadora Aberta"))
            seccionadora89p2e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r5() {
        if (seccionadora89r5.equals("Seccionadora Aberta"))
            seccionadora89r5 = "Seccionadora Fechada";
        else if (seccionadora89r5.equals("Seccionadora Fechada"))
            seccionadora89r5 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r5() {
        if (seccionadora89r5.equals("Seccionadora Fechada"))
            seccionadora89r5 = "Seccionadora Aberta";
        else if (seccionadora89r5.equals("Seccionadora Aberta"))
            seccionadora89r5 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r5e() {
        if (seccionadora89r5e.equals("Seccionadora Aberta"))
            seccionadora89r5e = "Seccionadora Fechada";
        else if (seccionadora89r5e.equals("Seccionadora Fechada"))
            seccionadora89r5e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r5e() {
        if (seccionadora89r5e.equals("Seccionadora Fechada"))
            seccionadora89r5e = "Seccionadora Aberta";
        else if (seccionadora89r5e.equals("Seccionadora Aberta"))
            seccionadora89r5e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r4() {
        if (seccionadora89r4.equals("Seccionadora Aberta"))
            seccionadora89r4 = "Seccionadora Fechada";
        else if (seccionadora89r4.equals("Seccionadora Fechada"))
            seccionadora89r4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r4() {
        if (seccionadora89r4.equals("Seccionadora Fechada"))
            seccionadora89r4 = "Seccionadora Aberta";
        else if (seccionadora89r4.equals("Seccionadora Aberta"))
            seccionadora89r4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r4e() {
        if (seccionadora89r4e.equals("Seccionadora Aberta"))
            seccionadora89r4e = "Seccionadora Fechada";
        else if (seccionadora89r4e.equals("Seccionadora Fechada"))
            seccionadora89r4e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r4e() {
        if (seccionadora89r4e.equals("Seccionadora Fechada"))
            seccionadora89r4e = "Seccionadora Aberta";
        else if (seccionadora89r4e.equals("Seccionadora Aberta"))
            seccionadora89r4e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r3() {
        if (seccionadora89r3.equals("Seccionadora Aberta"))
            seccionadora89r3 = "Seccionadora Fechada";
        else if (seccionadora89r3.equals("Seccionadora Fechada"))
            seccionadora89r3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r3() {
        if (seccionadora89r3.equals("Seccionadora Fechada"))
            seccionadora89r3 = "Seccionadora Aberta";
        else if (seccionadora89r3.equals("Seccionadora Aberta"))
            seccionadora89r3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r3e() {
        if (seccionadora89r3e.equals("Seccionadora Aberta"))
            seccionadora89r3e = "Seccionadora Fechada";
        else if (seccionadora89r3e.equals("Seccionadora Fechada"))
            seccionadora89r3e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r3e() {
        if (seccionadora89r3e.equals("Seccionadora Fechada"))
            seccionadora89r3e = "Seccionadora Aberta";
        else if (seccionadora89r3e.equals("Seccionadora Aberta"))
            seccionadora89r3e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r2() {
        if (seccionadora89r2.equals("Seccionadora Aberta"))
            seccionadora89r2 = "Seccionadora Fechada";
        else if (seccionadora89r2.equals("Seccionadora Fechada"))
            seccionadora89r2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r2() {
        if (seccionadora89r2.equals("Seccionadora Fechada"))
            seccionadora89r2 = "Seccionadora Aberta";
        else if (seccionadora89r2.equals("Seccionadora Aberta"))
            seccionadora89r2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r2e() {
        if (seccionadora89r2e.equals("Seccionadora Aberta"))
            seccionadora89r2e = "Seccionadora Fechada";
        else if (seccionadora89r2e.equals("Seccionadora Fechada"))
            seccionadora89r2e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r2e() {
        if (seccionadora89r2e.equals("Seccionadora Fechada"))
            seccionadora89r2e = "Seccionadora Aberta";
        else if (seccionadora89r2e.equals("Seccionadora Aberta"))
            seccionadora89r2e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r1() {
        if (seccionadora89r1.equals("Seccionadora Aberta"))
            seccionadora89r1 = "Seccionadora Fechada";
        else if (seccionadora89r1.equals("Seccionadora Fechada"))
            seccionadora89r1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r1() {
        if (seccionadora89r1.equals("Seccionadora Fechada"))
            seccionadora89r1 = "Seccionadora Aberta";
        else if (seccionadora89r1.equals("Seccionadora Aberta"))
            seccionadora89r1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r1e() {
        if (seccionadora89r1e.equals("Seccionadora Aberta"))
            seccionadora89r1e = "Seccionadora Fechada";
        else if (seccionadora89r1e.equals("Seccionadora Fechada"))
            seccionadora89r1e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r1e() {
        if (seccionadora89r1e.equals("Seccionadora Fechada"))
            seccionadora89r1e = "Seccionadora Aberta";
        else if (seccionadora89r1e.equals("Seccionadora Aberta"))
            seccionadora89r1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a2() {
        if (seccionadora89a2.equals("Seccionadora Aberta"))
            seccionadora89a2 = "Seccionadora Fechada";
        else if (seccionadora89a2.equals("Seccionadora Fechada"))
            seccionadora89a2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a2() {
        if (seccionadora89a2.equals("Seccionadora Fechada"))
            seccionadora89a2 = "Seccionadora Aberta";
        else if (seccionadora89a2.equals("Seccionadora Aberta"))
            seccionadora89a2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a2e() {
        if (seccionadora89a2e.equals("Seccionadora Aberta"))
            seccionadora89a2e = "Seccionadora Fechada";
        else if (seccionadora89a2e.equals("Seccionadora Fechada"))
            seccionadora89a2e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a2e() {
        if (seccionadora89a2e.equals("Seccionadora Fechada"))
            seccionadora89a2e = "Seccionadora Aberta";
        else if (seccionadora89a2e.equals("Seccionadora Aberta"))
            seccionadora89a2e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a1() {
        if (seccionadora89a1.equals("Seccionadora Aberta"))
            seccionadora89a1 = "Seccionadora Fechada";
        else if (seccionadora89a1.equals("Seccionadora Fechada"))
            seccionadora89a1 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a1() {
        if (seccionadora89a1.equals("Seccionadora Fechada"))
            seccionadora89a1 = "Seccionadora Aberta";
        else if (seccionadora89a1.equals("Seccionadora Aberta"))
            seccionadora89a1 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a1e() {
        if (seccionadora89a1e.equals("Seccionadora Aberta"))
            seccionadora89a1e = "Seccionadora Fechada";
        else if (seccionadora89a1e.equals("Seccionadora Fechada"))
            seccionadora89a1e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a1e() {
        if (seccionadora89a1e.equals("Seccionadora Fechada"))
            seccionadora89a1e = "Seccionadora Aberta";
        else if (seccionadora89a1e.equals("Seccionadora Aberta"))
            seccionadora89a1e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89tu() {
        if (seccionadora89tu.equals("Seccionadora Aberta"))
            seccionadora89tu = "Seccionadora Fechada";
        else if (seccionadora89tu.equals("Seccionadora Fechada"))
            seccionadora89tu = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89tu() {
        if (seccionadora89tu.equals("Seccionadora Fechada"))
            seccionadora89tu = "Seccionadora Aberta";
        else if (seccionadora89tu.equals("Seccionadora Aberta"))
            seccionadora89tu = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89tue() {
        if (seccionadora89tue.equals("Seccionadora Aberta"))
            seccionadora89tue = "Seccionadora Fechada";
        else if (seccionadora89tue.equals("Seccionadora Fechada"))
            seccionadora89tue = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89tue() {
        if (seccionadora89tue.equals("Seccionadora Fechada"))
            seccionadora89tue = "Seccionadora Aberta";
        else if (seccionadora89tue.equals("Seccionadora Aberta"))
            seccionadora89tue = "Seccionadora Aberta";
    }

    public void setNomeSeccionadora89c1() {
        NomeSeccionadora89c1 = "Seccionadora 89 c1";
    }

    public void setQuantFechamento89c1() {
        QuantFechamento89c1 = QuantFechamento89c1 + 1;
    }

    public void setQuantAbertura89c1() {
        QuantAbertura89c1 = QuantAbertura89c1 + 1;
    }

    public void setManobraSeccionadora89c1() {
        ManobraSeccionadora89c1 = "Bay C1";
    }

    public void setNomeSeccionadora89c1e() {
        NomeSeccionadora89c1e = "Seccionadora 89 C1";
    }

    public void setQuantFechamento89c1e() {
        QuantFechamento89c1e = QuantFechamento89c1e + 1;
    }

    public void setManobraSeccionadora89c1e() {
        ManobraSeccionadora89c1e = "Bay C1";
    }

    public void setNomeSeccionadora89c2() {
        NomeSeccionadora89c2 = "Seccionadora 89 C2";
    }

    public void setManobraSeccionadora89c2() {
        ManobraSeccionadora89c2 = "Bay C2";
    }

    public void setNomeSeccionadora89c2e() {
        NomeSeccionadora89c2e = "Seccionadora 89 C2E";
    }

    public void setManobraSeccionadora89c2e() {
        ManobraSeccionadora89c2e = "Bay C2";
    }

    public void setNomeSeccionadora89r6() {
        NomeSeccionadora89r6 = "Seccionadora 89 R6";
    }

    public void setManobraSeccionadora89r6() {
        ManobraSeccionadora89r6 = "Bay R6";
    }

    public void setNomeSeccionadora89r6e() {
        NomeSeccionadora89r6e = "Seccionadora 89 R6E";
    }

    public void setManobraSeccionadora89r6e() {
        ManobraSeccionadora89r6e = "Bay R6";
    }

    public void setNomeSeccionadora89lvr1() {
        NomeSeccionadora89lvr1 = "Seccionadora 89 LVR1";
    }

    public void setManobraSeccionadora89lvr1() {
        ManobraSeccionadora89lvr1 = "Bay LVR1";
    }

    public void setNomeSeccionadora89lvr1e() {
        NomeSeccionadora89lvr1e = "Seccionadora 89 LVR1";
    }

    public void setManobraSeccionadora89lvr1e() {
        ManobraSeccionadora89lvr1e = "Bay LVR1";
    }

    public void setNomeSeccionadora89p1() {
        NomeSeccionadora89p1 = "Seccionadora 89 P1";
    }

    public void setManobraSeccionadora89p1() {
        ManobraSeccionadora89p1 = "Bay P1";
    }

    public void setNomeSeccionadora89p1e() {
        NomeSeccionadora89p1e = "Seccionadora 89 P1-E";
    }

    public void setManobraSeccionadora89p1e() {
        ManobraSeccionadora89p1e = "Bay P1";
    }

    public void setNomeSeccionadora89p2() {
        NomeSeccionadora89p2 = "Seccionadora 89 P2";
    }

    public void setManobraSeccionadora89p2() {
        ManobraSeccionadora89p2 = "Bay P2";
    }

    public void setNomeSeccionadora89p2e() {
        NomeSeccionadora89p2e = "Seccionadora 89 P2-E";
    }

    public void setManobraSeccionadora89p2e() {
        ManobraSeccionadora89p2e = "Bay P2";
    }

    public void setNomeSeccionadora89r5() {
        NomeSeccionadora89r5 = "Seccionadora 89 R5";
    }

    public void setManobraSeccionadora89r5() {
        ManobraSeccionadora89r5 = "Bay RF-5";
    }

    public void setNomeSeccionadora89r5e() {
        NomeSeccionadora89r5e = "Seccionadora 89 R5-E";
    }

    public void setManobraSeccionadora89r5e() {
        ManobraSeccionadora89r5e = "Bay RF-5";
    }

    public void setNomeSeccionadora89r4() {
        NomeSeccionadora89r4 = "Seccionadora 89 RF-4";
    }

    public void setManobraSeccionadora89r4() {
        ManobraSeccionadora89r4 = "Bay RF-4";
    }

    public void setNomeSeccionadora89r4e() {
        NomeSeccionadora89r4e = "Seccionadora 89 R4-E";
    }

    public void setManobraSeccionadora89r4e() {
        ManobraSeccionadora89r4e = "Bay RF-4";
    }

    public void setNomeSeccionadora89r3() {
        NomeSeccionadora89r3 = "Seccionadora 89 R3";
    }

    public void setManobraSeccionadora89r3() {
        ManobraSeccionadora89r3 = "Bay RF-3";
    }

    public void setNomeSeccionadora89r3e() {
        NomeSeccionadora89r3e = "Seccionadora 89 R3-E";
    }

    public void setManobraSeccionadora89r3e() {
        ManobraSeccionadora89r3e = "Bay RF-3";
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public void setData(String data) {
        Data = data;
    }

    public String seccionadora89c1() {
        return seccionadora89c1;
    }

    public String seccionadora89c1e() {
        return seccionadora89c1e;
    }

    public String seccionadora89c2() {
        return seccionadora89c2;
    }

    public String seccionadora89c2e() {
        return seccionadora89c2e;
    }

    public String seccionadora89r6() {
        return seccionadora89r6;
    }

    public String seccionadora89r6e() {
        return seccionadora89r6e;
    }

    public String seccionadora89lvr1() {
        return seccionadora89lvr1;
    }

    public String seccionadora89lvr1e() {
        return seccionadora89lvr1e;
    }

    public String seccionadora89ta1() {
        return seccionadora89ta1;
    }

    public String seccionadora89lvrr() {
        return seccionadora89lvrr;
    }

    public String seccionadora89lvrre() {
        return seccionadora89lvrre;
    }

    public String seccionadora89tar() {
        return seccionadora89tar;
    }

    public String seccionadora89p1() {
        return seccionadora89p1;
    }

    public String seccionadora89p1e() {
        return seccionadora89p1e;
    }

    public String seccionadora89p2() {
        return seccionadora89p2;
    }

    public String seccionadora89p2e() {
        return seccionadora89p2e;
    }

    public String seccionadora89a2() {
        return seccionadora89a2;
    }

    public String seccionadora89a2e() {
        return seccionadora89a2e;
    }

    public String seccionadora89a1() {
        return seccionadora89a1;
    }

    public String seccionadora89a1e() {
        return seccionadora89a1e;
    }

    public String seccionadora89tu() {
        return seccionadora89tu;
    }

    public String seccionadora89tue() {
        return seccionadora89tue;
    }

    public String seccionadora89r5() {
        return seccionadora89r5;
    }

    public String seccionadora89r5e() {
        return seccionadora89r5e;
    }

    public String seccionadora89r4() {
        return seccionadora89r4;
    }

    public String seccionadora89r4e() {
        return seccionadora89r4e;
    }

    public String seccionadora89r3() {
        return seccionadora89r3;
    }

    public String seccionadora89r3e() {
        return seccionadora89r3e;
    }

    public String seccionadora89r2() {
        return seccionadora89r2;
    }

    public String seccionadora89r2e() {
        return seccionadora89r2e;
    }

    public String seccionadora89r1() {
        return seccionadora89r1;
    }

    public String seccionadora89r1e() {
        return seccionadora89r1e;
    }

    public String nomeSeccionadora89p2() {
        return NomeSeccionadora89p2;
    }

    public String nomeSeccionadora89p2e() {
        return NomeSeccionadora89p2e;
    }

    public String nomeSeccionadora89r5() {
        return NomeSeccionadora89r5;
    }

    public String nomeSeccionadora89r5e() {
        return NomeSeccionadora89r5e;
    }

    public String nomeSeccionadora89r4() {
        return NomeSeccionadora89r4;
    }

    public String nomeSeccionadora89r4e() {
        return NomeSeccionadora89r4e;
    }

    public String nomeSeccionadora89r3() {
        return NomeSeccionadora89r3;
    }

    public String nomeSeccionadora89r3e() {
        return NomeSeccionadora89r3e;
    }

    public String nomeSeccionadora89r2() {
        return NomeSeccionadora89r2;
    }

    public String nomeSeccionadora89r2e() {
        return NomeSeccionadora89r2e;
    }

    public String nomeSeccionadora89r1() {
        return NomeSeccionadora89r1;
    }

    public String nomeSeccionadora89r1e() {
        return NomeSeccionadora89r1e;
    }

    public int getQuantFechamento89c1() {
        return QuantFechamento89c1;
    }

    public int getQuantAbertura89c1() {
        return QuantAbertura89c1;
    }

    public String manobraSeccionadora89c1() {
        return ManobraSeccionadora89c1;
    }

    public String nomeSeccionadora89c1() {
        return NomeSeccionadora89c1;
    }

    public String manobraSeccionadora89c2() {
        return ManobraSeccionadora89c2;
    }

    public int getQuantFechamento89c2() {
        return QuantFechamento89c2;
    }

    public int getQuantAbertura89r6() {
        return QuantAbertura89r6;
    }

    public String nomeSeccionadora89r6() {
        return NomeSeccionadora89r6;
    }

    public String manobraSeccionadora89r6() {
        return ManobraSeccionadora89r6;
    }

    public String nomeSeccionadora89lvr1() {
        return NomeSeccionadora89lvr1;
    }

    public String manobraSeccionadora89lvr1() {
        return ManobraSeccionadora89lvr1;
    }

    public String nomeSeccionadora89p1() {
        return NomeSeccionadora89p1;
    }

    public String manobraSeccionadora89p1() {
        return ManobraSeccionadora89p1;
    }

    public String manobraSeccionadora89p2() {
        return ManobraSeccionadora89p2;
    }

    public String manobraSeccionadora89r5() {
        return ManobraSeccionadora89r5;
    }

    public String manobraSeccionadora89r4() {
        return ManobraSeccionadora89r4;
    }

    public String manobraSeccionadora89r4e() {
        return ManobraSeccionadora89r4e;
    }

    public String manobraSeccionadora89r3() {
        return ManobraSeccionadora89r3;
    }

    public String manobraSeccionadora89r3e() {
        return ManobraSeccionadora89r3e;
    }

    public String manobraSeccionadora89r2() {
        return ManobraSeccionadora89r2;
    }

    public String manobraSeccionadora89r2e() {
        return ManobraSeccionadora89r2e;
    }

    public String manobraSeccionadora89r1() {
        return ManobraSeccionadora89r1;
    }

    public String manobraSeccionadora89r1e() {
        return ManobraSeccionadora89r1e;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getData() {
        return Data;
    }

    // ������������ SECCIONADORAS DA BARRA T2 ������������
    public void fecharSeccionadora89c3() {
        if (seccionadora89c3.equals("Seccionadora Aberta"))
            seccionadora89c3 = "Seccionadora Fechada";
        else if (seccionadora89c3.equals("Seccionadora Fechada"))
            seccionadora89c3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c3() {
        if (seccionadora89c3.equals("Seccionadora Fechada"))
            seccionadora89c3 = "Seccionadora Aberta";
        else if (seccionadora89c3.equals("Seccionadora Aberta"))
            seccionadora89c3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c3e() {
        if (seccionadora89c3e.equals("Seccionadora Aberta"))
            seccionadora89c3e = "Seccionadora Fechada";
        else if (seccionadora89c3e.equals("Seccionadora Fechada"))
            seccionadora89c3e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c3e() {
        if (seccionadora89c3e.equals("Seccionadora Fechada"))
            seccionadora89c3e = "Seccionadora Aberta";
        else if (seccionadora89c3e.equals("Seccionadora Aberta"))
            seccionadora89c3e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c4() {
        if (seccionadora89c4.equals("Seccionadora Aberta"))
            seccionadora89c4 = "Seccionadora Fechada";
        else if (seccionadora89c4.equals("Seccionadora Fechada"))
            seccionadora89c4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c4() {
        if (seccionadora89c4.equals("Seccionadora Fechada"))
            seccionadora89c4 = "Seccionadora Aberta";
        else if (seccionadora89c4.equals("Seccionadora Aberta"))
            seccionadora89c4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c4e() {
        if (seccionadora89c4e.equals("Seccionadora Aberta"))
            seccionadora89c4e = "Seccionadora Fechada";
        else if (seccionadora89c4e.equals("Seccionadora Fechada"))
            seccionadora89c4e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c4e() {
        if (seccionadora89c4e.equals("Seccionadora Fechada"))
            seccionadora89c4e = "Seccionadora Aberta";
        else if (seccionadora89c4e.equals("Seccionadora Aberta"))
            seccionadora89c4e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r7() {
        if (seccionadora89r7.equals("Seccionadora Aberta"))
            seccionadora89r7 = "Seccionadora Fechada";
        else if (seccionadora89r7.equals("Seccionadora Fechada"))
            seccionadora89r7 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r7() {
        if (seccionadora89r7.equals("Seccionadora Fechada"))
            seccionadora89r7 = "Seccionadora Aberta";
        else if (seccionadora89r7.equals("Seccionadora Aberta"))
            seccionadora89r7 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r7e() {
        if (seccionadora89r7e.equals("Seccionadora Aberta"))
            seccionadora89r7e = "Seccionadora Fechada";
        else if (seccionadora89r7e.equals("Seccionadora Fechada"))
            seccionadora89r7e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r7e() {
        if (seccionadora89r7e.equals("Seccionadora Fechada"))
            seccionadora89r7e = "Seccionadora Aberta";
        else if (seccionadora89r7e.equals("Seccionadora Aberta"))
            seccionadora89r7e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr2() {
        if (seccionadora89lvr2.equals("Seccionadora Aberta"))
            seccionadora89lvr2 = "Seccionadora Fechada";
        else if (seccionadora89lvr2.equals("Seccionadora Fechada"))
            seccionadora89lvr2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr2() {
        if (seccionadora89lvr2.equals("Seccionadora Fechada"))
            seccionadora89lvr2 = "Seccionadora Aberta";
        else if (seccionadora89lvr2.equals("Seccionadora Aberta"))
            seccionadora89lvr2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr2e() {
        if (seccionadora89lvr2e.equals("Seccionadora Aberta"))
            seccionadora89lvr2e = "Seccionadora Fechada";
        else if (seccionadora89lvr2e.equals("Seccionadora Fechada"))
            seccionadora89lvr2e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr2e() {
        if (seccionadora89lvr2e.equals("Seccionadora Fechada"))
            seccionadora89lvr2e = "Seccionadora Aberta";
        else if (seccionadora89lvr2e.equals("Seccionadora Aberta"))
            seccionadora89lvr2e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89ta2() {
        if (seccionadora89ta2.equals("Seccionadora Aberta"))
            seccionadora89ta2 = "Seccionadora Fechada";
        else if (seccionadora89ta2.equals("Seccionadora Fechada"))
            seccionadora89ta2 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89ta2() {
        if (seccionadora89ta2.equals("Seccionadora Fechada"))
            seccionadora89ta2 = "Seccionadora Aberta";
        else if (seccionadora89ta2.equals("Seccionadora Aberta"))
            seccionadora89ta2 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p3() {
        if (seccionadora89p3.equals("Seccionadora Aberta"))
            seccionadora89p3 = "Seccionadora Fechada";
        else if (seccionadora89p3.equals("Seccionadora Fechada"))
            seccionadora89p3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p3() {
        if (seccionadora89p3.equals("Seccionadora Fechada"))
            seccionadora89p3 = "Seccionadora Aberta";
        else if (seccionadora89p3.equals("Seccionadora Aberta"))
            seccionadora89p3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p3e() {
        if (seccionadora89p3e.equals("Seccionadora Aberta"))
            seccionadora89p3e = "Seccionadora Fechada";
        else if (seccionadora89p3e.equals("Seccionadora Fechada"))
            seccionadora89p3e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p3e() {
        if (seccionadora89p3e.equals("Seccionadora Fechada"))
            seccionadora89p3e = "Seccionadora Aberta";
        else if (seccionadora89p3e.equals("Seccionadora Aberta"))
            seccionadora89p3e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r12() {
        if (seccionadora89r12.equals("Seccionadora Aberta"))
            seccionadora89r12 = "Seccionadora Fechada";
        else if (seccionadora89r12.equals("Seccionadora Fechada"))
            seccionadora89r12 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r12() {
        if (seccionadora89r12.equals("Seccionadora Fechada"))
            seccionadora89r12 = "Seccionadora Aberta";
        else if (seccionadora89r12.equals("Seccionadora Aberta"))
            seccionadora89r12 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r12e() {
        if (seccionadora89r12e.equals("Seccionadora Aberta"))
            seccionadora89r12e = "Seccionadora Fechada";
        else if (seccionadora89r12e.equals("Seccionadora Fechada"))
            seccionadora89r12e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r12e() {
        if (seccionadora89r12e.equals("Seccionadora Fechada"))
            seccionadora89r12e = "Seccionadora Aberta";
        else if (seccionadora89r12e.equals("Seccionadora Aberta"))
            seccionadora89r12e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r11() {
        if (seccionadora89r11.equals("Seccionadora Aberta"))
            seccionadora89r11 = "Seccionadora Fechada";
        else if (seccionadora89r11.equals("Seccionadora Fechada"))
            seccionadora89r11 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r11() {
        if (seccionadora89r11.equals("Seccionadora Fechada"))
            seccionadora89r11 = "Seccionadora Aberta";
        else if (seccionadora89r11.equals("Seccionadora Aberta"))
            seccionadora89r11 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r11e() {
        if (seccionadora89r11e.equals("Seccionadora Aberta"))
            seccionadora89r11e = "Seccionadora Fechada";
        else if (seccionadora89r11e.equals("Seccionadora Fechada"))
            seccionadora89r11e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r11e() {
        if (seccionadora89r11e.equals("Seccionadora Fechada"))
            seccionadora89r11e = "Seccionadora Aberta";
        else if (seccionadora89r11e.equals("Seccionadora Aberta"))
            seccionadora89r11e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r10() {
        if (seccionadora89r10.equals("Seccionadora Aberta"))
            seccionadora89r10 = "Seccionadora Fechada";
        else if (seccionadora89r10.equals("Seccionadora Fechada"))
            seccionadora89r10 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r10() {
        if (seccionadora89r10.equals("Seccionadora Fechada"))
            seccionadora89r10 = "Seccionadora Aberta";
        else if (seccionadora89r10.equals("Seccionadora Aberta"))
            seccionadora89r10 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r10e() {
        if (seccionadora89r10e.equals("Seccionadora Aberta"))
            seccionadora89r10e = "Seccionadora Fechada";
        else if (seccionadora89r10e.equals("Seccionadora Fechada"))
            seccionadora89r10e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r10e() {
        if (seccionadora89r10e.equals("Seccionadora Fechada"))
            seccionadora89r10e = "Seccionadora Aberta";
        else if (seccionadora89r10e.equals("Seccionadora Aberta"))
            seccionadora89r10e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r9() {
        if (seccionadora89r9.equals("Seccionadora Aberta"))
            seccionadora89r9 = "Seccionadora Fechada";
        else if (seccionadora89r9.equals("Seccionadora Fechada"))
            seccionadora89r9 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r9() {
        if (seccionadora89r9.equals("Seccionadora Fechada"))
            seccionadora89r9 = "Seccionadora Aberta";
        else if (seccionadora89r9.equals("Seccionadora Aberta"))
            seccionadora89r9 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r9e() {
        if (seccionadora89r9e.equals("Seccionadora Aberta"))
            seccionadora89r9e = "Seccionadora Fechada";
        else if (seccionadora89r9e.equals("Seccionadora Fechada"))
            seccionadora89r9e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r9e() {
        if (seccionadora89r9e.equals("Seccionadora Fechada"))
            seccionadora89r9e = "Seccionadora Aberta";
        else if (seccionadora89r9e.equals("Seccionadora Aberta"))
            seccionadora89r9e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r8() {
        if (seccionadora89r8.equals("Seccionadora Aberta"))
            seccionadora89r8 = "Seccionadora Fechada";
        else if (seccionadora89r8.equals("Seccionadora Fechada"))
            seccionadora89r8 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r8() {
        if (seccionadora89r8.equals("Seccionadora Fechada"))
            seccionadora89r8 = "Seccionadora Aberta";
        else if (seccionadora89r8.equals("Seccionadora Aberta"))
            seccionadora89r8 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r8e() {
        if (seccionadora89r8e.equals("Seccionadora Aberta"))
            seccionadora89r8e = "Seccionadora Fechada";
        else if (seccionadora89r8e.equals("Seccionadora Fechada"))
            seccionadora89r8e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r8e() {
        if (seccionadora89r8e.equals("Seccionadora Fechada"))
            seccionadora89r8e = "Seccionadora Aberta";
        else if (seccionadora89r8e.equals("Seccionadora Aberta"))
            seccionadora89r8e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a3() {
        if (seccionadora89a3.equals("Seccionadora Aberta"))
            seccionadora89a3 = "Seccionadora Fechada";
        else if (seccionadora89a3.equals("Seccionadora Fechada"))
            seccionadora89a3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a3() {
        if (seccionadora89a3.equals("Seccionadora Fechada"))
            seccionadora89a3 = "Seccionadora Aberta";
        else if (seccionadora89a3.equals("Seccionadora Aberta"))
            seccionadora89a3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a3e() {
        if (seccionadora89a3e.equals("Seccionadora Aberta"))
            seccionadora89a3e = "Seccionadora Fechada";
        else if (seccionadora89a3e.equals("Seccionadora Fechada"))
            seccionadora89a3e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a3e() {
        if (seccionadora89a3e.equals("Seccionadora Fechada"))
            seccionadora89a3e = "Seccionadora Aberta";
        else if (seccionadora89a3e.equals("Seccionadora Aberta"))
            seccionadora89a3e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a4() {
        if (seccionadora89a4.equals("Seccionadora Aberta"))
            seccionadora89a4 = "Seccionadora Fechada";
        else if (seccionadora89a4.equals("Seccionadora Fechada"))
            seccionadora89a4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a4() {
        if (seccionadora89a4.equals("Seccionadora Fechada"))
            seccionadora89a4 = "Seccionadora Aberta";
        else if (seccionadora89a4.equals("Seccionadora Aberta"))
            seccionadora89a4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a4e() {
        if (seccionadora89a4e.equals("Seccionadora Aberta"))
            seccionadora89a4e = "Seccionadora Fechada";
        else if (seccionadora89a4e.equals("Seccionadora Fechada"))
            seccionadora89a4e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a4e() {
        if (seccionadora89a4e.equals("Seccionadora Fechada"))
            seccionadora89a4e = "Seccionadora Aberta";
        else if (seccionadora89a4e.equals("Seccionadora Aberta"))
            seccionadora89a4e = "Seccionadora Aberta";
    }

    public String seccionadora89c3() {
        return seccionadora89c3;
    }

    public String seccionadora89c3e() {
        return seccionadora89c3e;
    }

    public String seccionadora89c4() {
        return seccionadora89c4;
    }

    public String seccionadora89c4e() {
        return seccionadora89c4e;
    }

    public String seccionadora89r7() {
        return seccionadora89r7;
    }

    public String seccionadora89r7e() {
        return seccionadora89r7e;
    }

    public String seccionadora89lvr2() {
        return seccionadora89lvr2;
    }

    public String seccionadora89lvr2e() {
        return seccionadora89lvr2e;
    }

    public String seccionadora89ta2() {
        return seccionadora89ta2;
    }

    public String seccionadora89p3() {
        return seccionadora89p3;
    }

    public String seccionadora89p3e() {
        return seccionadora89p3e;
    }

    public String seccionadora89a3() {
        return seccionadora89a3;
    }

    public String seccionadora89a3e() {
        return seccionadora89a3e;
    }

    public String seccionadora89a4() {
        return seccionadora89a4;
    }

    public String seccionadora89a4e() {
        return seccionadora89a4e;
    }

    public String seccionadora89r12() {
        return seccionadora89r12;
    }

    public String seccionadora89r12e() {
        return seccionadora89r12e;
    }

    public String seccionadora89r11() {
        return seccionadora89r11;
    }

    public String seccionadora89r11e() {
        return seccionadora89r11e;
    }

    public String seccionadora89r10() {
        return seccionadora89r10;
    }

    public String seccionadora89r10e() {
        return seccionadora89r10e;
    }

    public String seccionadora89r9() {
        return seccionadora89r9;
    }

    public String seccionadora89r9e() {
        return seccionadora89r9e;
    }

    public String seccionadora89r8() {
        return seccionadora89r8;
    }

    public String seccionadora89r8e() {
        return seccionadora89r8e;
    }

    // ��������������������� SECCIONADORAS DA BARRA T3 �����������������
    public void fecharSeccionadora89c5() {
        if (seccionadora89c5.equals("Seccionadora Aberta"))
            seccionadora89c5 = "Seccionadora Fechada";
        else if (seccionadora89c5.equals("Seccionadora Fechada"))
            seccionadora89c5 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c5() {
        if (seccionadora89c5.equals("Seccionadora Fechada"))
            seccionadora89c5 = "Seccionadora Aberta";
        else if (seccionadora89c5.equals("Seccionadora Aberta"))
            seccionadora89c5 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c5e() {
        if (seccionadora89c5e.equals("Seccionadora Aberta"))
            seccionadora89c5e = "Seccionadora Fechada";
        else if (seccionadora89c5e.equals("Seccionadora Fechada"))
            seccionadora89c5e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c5e() {
        if (seccionadora89c5e.equals("Seccionadora Fechada"))
            seccionadora89c5e = "Seccionadora Aberta";
        else if (seccionadora89c5e.equals("Seccionadora Aberta"))
            seccionadora89c5e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c6() {
        if (seccionadora89c6.equals("Seccionadora Aberta"))
            seccionadora89c6 = "Seccionadora Fechada";
        else if (seccionadora89c6.equals("Seccionadora Fechada"))
            seccionadora89c6 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c6() {
        if (seccionadora89c6.equals("Seccionadora Fechada"))
            seccionadora89c6 = "Seccionadora Aberta";
        else if (seccionadora89c6.equals("Seccionadora Aberta"))
            seccionadora89c6 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c6e() {
        if (seccionadora89c6e.equals("Seccionadora Aberta"))
            seccionadora89c6e = "Seccionadora Fechada";
        else if (seccionadora89c6e.equals("Seccionadora Fechada"))
            seccionadora89c6e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c6e() {
        if (seccionadora89c6e.equals("Seccionadora Fechada"))
            seccionadora89c6e = "Seccionadora Aberta";
        else if (seccionadora89c6e.equals("Seccionadora Aberta"))
            seccionadora89c6e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r13() {
        if (seccionadora89r13.equals("Seccionadora Aberta"))
            seccionadora89r13 = "Seccionadora Fechada";
        else if (seccionadora89r13.equals("Seccionadora Fechada"))
            seccionadora89r13 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r13() {
        if (seccionadora89r13.equals("Seccionadora Fechada"))
            seccionadora89r13 = "Seccionadora Aberta";
        else if (seccionadora89r13.equals("Seccionadora Aberta"))
            seccionadora89r13 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r13e() {
        if (seccionadora89r13e.equals("Seccionadora Aberta"))
            seccionadora89r13e = "Seccionadora Fechada";
        else if (seccionadora89r13e.equals("Seccionadora Fechada"))
            seccionadora89r13e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r13e() {
        if (seccionadora89r13e.equals("Seccionadora Fechada"))
            seccionadora89r13e = "Seccionadora Aberta";
        else if (seccionadora89r13e.equals("Seccionadora Aberta"))
            seccionadora89r13e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr3() {
        if (seccionadora89lvr3.equals("Seccionadora Aberta"))
            seccionadora89lvr3 = "Seccionadora Fechada";
        else if (seccionadora89lvr3.equals("Seccionadora Fechada"))
            seccionadora89lvr3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr3() {
        if (seccionadora89lvr3.equals("Seccionadora Fechada"))
            seccionadora89lvr3 = "Seccionadora Aberta";
        else if (seccionadora89lvr3.equals("Seccionadora Aberta"))
            seccionadora89lvr3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr3e() {
        if (seccionadora89lvr3e.equals("Seccionadora Aberta"))
            seccionadora89lvr3e = "Seccionadora Fechada";
        else if (seccionadora89lvr3e.equals("Seccionadora Fechada"))
            seccionadora89lvr3e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr3e() {
        if (seccionadora89lvr3e.equals("Seccionadora Fechada"))
            seccionadora89lvr3e = "Seccionadora Aberta";
        else if (seccionadora89lvr3e.equals("Seccionadora Aberta"))
            seccionadora89lvr3e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89ta3() {
        if (seccionadora89ta3.equals("Seccionadora Aberta"))
            seccionadora89ta3 = "Seccionadora Fechada";
        else if (seccionadora89ta3.equals("Seccionadora Fechada"))
            seccionadora89ta3 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89ta3() {
        if (seccionadora89ta3.equals("Seccionadora Fechada"))
            seccionadora89ta3 = "Seccionadora Aberta";
        else if (seccionadora89ta3.equals("Seccionadora Aberta"))
            seccionadora89ta3 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p4() {
        if (seccionadora89p4.equals("Seccionadora Aberta"))
            seccionadora89p4 = "Seccionadora Fechada";
        else if (seccionadora89p4.equals("Seccionadora Fechada"))
            seccionadora89p4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p4() {
        if (seccionadora89p4.equals("Seccionadora Fechada"))
            seccionadora89p4 = "Seccionadora Aberta";
        else if (seccionadora89p4.equals("Seccionadora Aberta"))
            seccionadora89p4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p4e() {
        if (seccionadora89p4e.equals("Seccionadora Aberta"))
            seccionadora89p4e = "Seccionadora Fechada";
        else if (seccionadora89p4e.equals("Seccionadora Fechada"))
            seccionadora89p4e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p4e() {
        if (seccionadora89p4e.equals("Seccionadora Fechada"))
            seccionadora89p4e = "Seccionadora Aberta";
        else if (seccionadora89p4e.equals("Seccionadora Aberta"))
            seccionadora89p4e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p5() {
        if (seccionadora89p5.equals("Seccionadora Aberta"))
            seccionadora89p5 = "Seccionadora Fechada";
        else if (seccionadora89p5.equals("Seccionadora Fechada"))
            seccionadora89p5 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p5() {
        if (seccionadora89p5.equals("Seccionadora Fechada"))
            seccionadora89p5 = "Seccionadora Aberta";
        else if (seccionadora89p5.equals("Seccionadora Aberta"))
            seccionadora89p5 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p5e() {
        if (seccionadora89p5e.equals("Seccionadora Aberta"))
            seccionadora89p5e = "Seccionadora Fechada";
        else if (seccionadora89p5e.equals("Seccionadora Fechada"))
            seccionadora89p5e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p5e() {
        if (seccionadora89p5e.equals("Seccionadora Fechada"))
            seccionadora89p5e = "Seccionadora Aberta";
        else if (seccionadora89p5e.equals("Seccionadora Aberta"))
            seccionadora89p5e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r18() {
        if (seccionadora89r18.equals("Seccionadora Aberta"))
            seccionadora89r18 = "Seccionadora Fechada";
        else if (seccionadora89r18.equals("Seccionadora Fechada"))
            seccionadora89r18 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r18() {
        if (seccionadora89r18.equals("Seccionadora Fechada"))
            seccionadora89r18 = "Seccionadora Aberta";
        else if (seccionadora89r18.equals("Seccionadora Aberta"))
            seccionadora89r18 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r18e() {
        if (seccionadora89r18e.equals("Seccionadora Aberta"))
            seccionadora89r18e = "Seccionadora Fechada";
        else if (seccionadora89r18e.equals("Seccionadora Fechada"))
            seccionadora89r18e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r18e() {
        if (seccionadora89r18e.equals("Seccionadora Fechada"))
            seccionadora89r18e = "Seccionadora Aberta";
        else if (seccionadora89r18e.equals("Seccionadora Aberta"))
            seccionadora89r18e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r17() {
        if (seccionadora89r17.equals("Seccionadora Aberta"))
            seccionadora89r17 = "Seccionadora Fechada";
        else if (seccionadora89r17.equals("Seccionadora Fechada"))
            seccionadora89r17 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r17() {
        if (seccionadora89r17.equals("Seccionadora Fechada"))
            seccionadora89r17 = "Seccionadora Aberta";
        else if (seccionadora89r17.equals("Seccionadora Aberta"))
            seccionadora89r17 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r17e() {
        if (seccionadora89r17e.equals("Seccionadora Aberta"))
            seccionadora89r17e = "Seccionadora Fechada";
        else if (seccionadora89r17e.equals("Seccionadora Fechada"))
            seccionadora89r17e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r17e() {
        if (seccionadora89r17e.equals("Seccionadora Fechada"))
            seccionadora89r17e = "Seccionadora Aberta";
        else if (seccionadora89r17e.equals("Seccionadora Aberta"))
            seccionadora89r17e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r16() {
        if (seccionadora89r16.equals("Seccionadora Aberta"))
            seccionadora89r16 = "Seccionadora Fechada";
        else if (seccionadora89r16.equals("Seccionadora Fechada"))
            seccionadora89r16 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r16() {
        if (seccionadora89r16.equals("Seccionadora Fechada"))
            seccionadora89r16 = "Seccionadora Aberta";
        else if (seccionadora89r16.equals("Seccionadora Aberta"))
            seccionadora89r16 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r16e() {
        if (seccionadora89r16e.equals("Seccionadora Aberta"))
            seccionadora89r16e = "Seccionadora Fechada";
        else if (seccionadora89r16e.equals("Seccionadora Fechada"))
            seccionadora89r16e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r16e() {
        if (seccionadora89r16e.equals("Seccionadora Fechada"))
            seccionadora89r16e = "Seccionadora Aberta";
        else if (seccionadora89r16e.equals("Seccionadora Aberta"))
            seccionadora89r16e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r15() {
        if (seccionadora89r15.equals("Seccionadora Aberta"))
            seccionadora89r15 = "Seccionadora Fechada";
        else if (seccionadora89r15.equals("Seccionadora Fechada"))
            seccionadora89r15 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r15() {
        if (seccionadora89r15.equals("Seccionadora Fechada"))
            seccionadora89r15 = "Seccionadora Aberta";
        else if (seccionadora89r15.equals("Seccionadora Aberta"))
            seccionadora89r15 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r15e() {
        if (seccionadora89r15e.equals("Seccionadora Aberta"))
            seccionadora89r15e = "Seccionadora Fechada";
        else if (seccionadora89r15e.equals("Seccionadora Fechada"))
            seccionadora89r15e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r15e() {
        if (seccionadora89r15e.equals("Seccionadora Fechada"))
            seccionadora89r15e = "Seccionadora Aberta";
        else if (seccionadora89r15e.equals("Seccionadora Aberta"))
            seccionadora89r15e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r14() {
        if (seccionadora89r14.equals("Seccionadora Aberta"))
            seccionadora89r14 = "Seccionadora Fechada";
        else if (seccionadora89r14.equals("Seccionadora Fechada"))
            seccionadora89r14 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r14() {
        if (seccionadora89r14.equals("Seccionadora Fechada"))
            seccionadora89r14 = "Seccionadora Aberta";
        else if (seccionadora89r14.equals("Seccionadora Aberta"))
            seccionadora89r14 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r14e() {
        if (seccionadora89r14e.equals("Seccionadora Aberta"))
            seccionadora89r14e = "Seccionadora Fechada";
        else if (seccionadora89r14e.equals("Seccionadora Fechada"))
            seccionadora89r14e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r14e() {
        if (seccionadora89r14e.equals("Seccionadora Fechada"))
            seccionadora89r14e = "Seccionadora Aberta";
        else if (seccionadora89r14e.equals("Seccionadora Aberta"))
            seccionadora89r14e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a5() {
        if (seccionadora89a5.equals("Seccionadora Aberta"))
            seccionadora89a5 = "Seccionadora Fechada";
        else if (seccionadora89a5.equals("Seccionadora Fechada"))
            seccionadora89a5 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a5() {
        if (seccionadora89a5.equals("Seccionadora Fechada"))
            seccionadora89a5 = "Seccionadora Aberta";
        else if (seccionadora89a5.equals("Seccionadora Aberta"))
            seccionadora89a5 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a5e() {
        if (seccionadora89a5e.equals("Seccionadora Aberta"))
            seccionadora89a5e = "Seccionadora Fechada";
        else if (seccionadora89a5e.equals("Seccionadora Fechada"))
            seccionadora89a5e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a5e() {
        if (seccionadora89a5e.equals("Seccionadora Fechada"))
            seccionadora89a5e = "Seccionadora Aberta";
        else if (seccionadora89a5e.equals("Seccionadora Aberta"))
            seccionadora89a5e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a6() {
        if (seccionadora89a6.equals("Seccionadora Aberta"))
            seccionadora89a6 = "Seccionadora Fechada";
        else if (seccionadora89a6.equals("Seccionadora Fechada"))
            seccionadora89a6 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a6() {
        if (seccionadora89a6.equals("Seccionadora Fechada"))
            seccionadora89a6 = "Seccionadora Aberta";
        else if (seccionadora89a6.equals("Seccionadora Aberta"))
            seccionadora89a6 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a6e() {
        if (seccionadora89a6e.equals("Seccionadora Aberta"))
            seccionadora89a6e = "Seccionadora Fechada";
        else if (seccionadora89a6e.equals("Seccionadora Fechada"))
            seccionadora89a6e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a6e() {
        if (seccionadora89a6e.equals("Seccionadora Fechada"))
            seccionadora89a6e = "Seccionadora Aberta";
        else if (seccionadora89a6e.equals("Seccionadora Aberta"))
            seccionadora89a6e = "Seccionadora Aberta";
    }

    public String seccionadora89c5() {
        return seccionadora89c5;
    }

    public String seccionadora89c5e() {
        return seccionadora89c5e;
    }

    public String seccionadora89c6() {
        return seccionadora89c6;
    }

    public String seccionadora89c6e() {
        return seccionadora89c6e;
    }

    public String seccionadora89r13() {
        return seccionadora89r13;
    }

    public String seccionadora89r13e() {
        return seccionadora89r13e;
    }

    public String seccionadora89lvr3() {
        return seccionadora89lvr3;
    }

    public String seccionadora89lvr3e() {
        return seccionadora89lvr3e;
    }

    public String seccionadora89ta3() {
        return seccionadora89ta3;
    }

    public String seccionadora89p4() {
        return seccionadora89p4;
    }

    public String seccionadora89p4e() {
        return seccionadora89p4e;
    }

    public String seccionadora89p5() {
        return seccionadora89p5;
    }

    public String seccionadora89p5e() {
        return seccionadora89p5e;
    }

    public String seccionadora89a5() {
        return seccionadora89a5;
    }

    public String seccionadora89a5e() {
        return seccionadora89a5e;
    }

    public String seccionadora89a6() {
        return seccionadora89a6;
    }

    public String seccionadora89a6e() {
        return seccionadora89a6e;
    }

    public String seccionadora89r18() {
        return seccionadora89r18;
    }

    public String seccionadora89r18e() {
        return seccionadora89r18e;
    }

    public String seccionadora89r17() {
        return seccionadora89r17;
    }

    public String seccionadora89r17e() {
        return seccionadora89r17e;
    }

    public String seccionadora89r16() {
        return seccionadora89r16;
    }

    public String seccionadora89r16e() {
        return seccionadora89r16e;
    }

    public String seccionadora89r15() {
        return seccionadora89r15;
    }

    public String seccionadora89r15e() {
        return seccionadora89r15e;
    }

    public String seccionadora89r14() {
        return seccionadora89r14;
    }

    public String seccionadora89r14e() {
        return seccionadora89r14e;
    }

    // ������������ SECCIONADORAS DA BARRA T4 ������������
    public void fecharSeccionadora89c7() {
        if (seccionadora89c7.equals("Seccionadora Aberta"))
            seccionadora89c7 = "Seccionadora Fechada";
        else if (seccionadora89c7.equals("Seccionadora Fechada"))
            seccionadora89c7 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c7() {
        if (seccionadora89c7.equals("Seccionadora Fechada"))
            seccionadora89c7 = "Seccionadora Aberta";
        else if (seccionadora89c7.equals("Seccionadora Aberta"))
            seccionadora89c7 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c7e() {
        if (seccionadora89c7e.equals("Seccionadora Aberta"))
            seccionadora89c7e = "Seccionadora Fechada";
        else if (seccionadora89c7e.equals("Seccionadora Fechada"))
            seccionadora89c7e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c7e() {
        if (seccionadora89c7e.equals("Seccionadora Fechada"))
            seccionadora89c7e = "Seccionadora Aberta";
        else if (seccionadora89c7e.equals("Seccionadora Aberta"))
            seccionadora89c7e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c8() {
        if (seccionadora89c8.equals("Seccionadora Aberta"))
            seccionadora89c8 = "Seccionadora Fechada";
        else if (seccionadora89c8.equals("Seccionadora Fechada"))
            seccionadora89c8 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c8() {
        if (seccionadora89c8.equals("Seccionadora Fechada"))
            seccionadora89c8 = "Seccionadora Aberta";
        else if (seccionadora89c8.equals("Seccionadora Aberta"))
            seccionadora89c8 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89c8e() {
        if (seccionadora89c8e.equals("Seccionadora Aberta"))
            seccionadora89c8e = "Seccionadora Fechada";
        else if (seccionadora89c8e.equals("Seccionadora Fechada"))
            seccionadora89c8e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89c8e() {
        if (seccionadora89c8e.equals("Seccionadora Fechada"))
            seccionadora89c8e = "Seccionadora Aberta";
        else if (seccionadora89c8e.equals("Seccionadora Aberta"))
            seccionadora89c8e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r19() {
        if (seccionadora89r19.equals("Seccionadora Aberta"))
            seccionadora89r19 = "Seccionadora Fechada";
        else if (seccionadora89r19.equals("Seccionadora Fechada"))
            seccionadora89r19 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r19() {
        if (seccionadora89r19.equals("Seccionadora Fechada"))
            seccionadora89r19 = "Seccionadora Aberta";
        else if (seccionadora89r19.equals("Seccionadora Aberta"))
            seccionadora89r19 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r19e() {
        if (seccionadora89r19e.equals("Seccionadora Aberta"))
            seccionadora89r19e = "Seccionadora Fechada";
        else if (seccionadora89r19e.equals("Seccionadora Fechada"))
            seccionadora89r19e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r19e() {
        if (seccionadora89r19e.equals("Seccionadora Fechada"))
            seccionadora89r19e = "Seccionadora Aberta";
        else if (seccionadora89r19e.equals("Seccionadora Aberta"))
            seccionadora89r19e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr4() {
        if (seccionadora89lvr4.equals("Seccionadora Aberta"))
            seccionadora89lvr4 = "Seccionadora Fechada";
        else if (seccionadora89lvr4.equals("Seccionadora Fechada"))
            seccionadora89lvr4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr4() {
        if (seccionadora89lvr4.equals("Seccionadora Fechada"))
            seccionadora89lvr4 = "Seccionadora Aberta";
        else if (seccionadora89lvr4.equals("Seccionadora Aberta"))
            seccionadora89lvr4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89lvr4e() {
        if (seccionadora89lvr4e.equals("Seccionadora Aberta"))
            seccionadora89lvr4e = "Seccionadora Fechada";
        else if (seccionadora89lvr4e.equals("Seccionadora Fechada"))
            seccionadora89lvr4e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89lvr4e() {
        if (seccionadora89lvr4e.equals("Seccionadora Fechada"))
            seccionadora89lvr4e = "Seccionadora Aberta";
        else if (seccionadora89lvr4e.equals("Seccionadora Aberta"))
            seccionadora89lvr4e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89ta4() {
        if (seccionadora89ta4.equals("Seccionadora Aberta"))
            seccionadora89ta4 = "Seccionadora Fechada";
        else if (seccionadora89ta4.equals("Seccionadora Fechada"))
            seccionadora89ta4 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89ta4() {
        if (seccionadora89ta4.equals("Seccionadora Fechada"))
            seccionadora89ta4 = "Seccionadora Aberta";
        else if (seccionadora89ta4.equals("Seccionadora Aberta"))
            seccionadora89ta4 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p6() {
        if (seccionadora89p6.equals("Seccionadora Aberta"))
            seccionadora89p6 = "Seccionadora Fechada";
        else if (seccionadora89p6.equals("Seccionadora Fechada"))
            seccionadora89p6 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p6() {
        if (seccionadora89p6.equals("Seccionadora Fechada"))
            seccionadora89p6 = "Seccionadora Aberta";
        else if (seccionadora89p6.equals("Seccionadora Aberta"))
            seccionadora89p6 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89p6e() {
        if (seccionadora89p6e.equals("Seccionadora Aberta"))
            seccionadora89p6e = "Seccionadora Fechada";
        else if (seccionadora89p6e.equals("Seccionadora Fechada"))
            seccionadora89p6e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89p6e() {
        if (seccionadora89p6e.equals("Seccionadora Fechada"))
            seccionadora89p6e = "Seccionadora Aberta";
        else if (seccionadora89p6e.equals("Seccionadora Aberta"))
            seccionadora89p6e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r24() {
        if (seccionadora89r24.equals("Seccionadora Aberta"))
            seccionadora89r24 = "Seccionadora Fechada";
        else if (seccionadora89r24.equals("Seccionadora Fechada"))
            seccionadora89r24 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r24() {
        if (seccionadora89r24.equals("Seccionadora Fechada"))
            seccionadora89r24 = "Seccionadora Aberta";
        else if (seccionadora89r24.equals("Seccionadora Aberta"))
            seccionadora89r24 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r24e() {
        if (seccionadora89r24e.equals("Seccionadora Aberta"))
            seccionadora89r24e = "Seccionadora Fechada";
        else if (seccionadora89r24e.equals("Seccionadora Fechada"))
            seccionadora89r24e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r24e() {
        if (seccionadora89r24e.equals("Seccionadora Fechada"))
            seccionadora89r24e = "Seccionadora Aberta";
        else if (seccionadora89r24e.equals("Seccionadora Aberta"))
            seccionadora89r24e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r23() {
        if (seccionadora89r23.equals("Seccionadora Aberta"))
            seccionadora89r23 = "Seccionadora Fechada";
        else if (seccionadora89r23.equals("Seccionadora Fechada"))
            seccionadora89r23 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r23() {
        if (seccionadora89r23.equals("Seccionadora Fechada"))
            seccionadora89r23 = "Seccionadora Aberta";
        else if (seccionadora89r23.equals("Seccionadora Aberta"))
            seccionadora89r23 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r23e() {
        if (seccionadora89r11e.equals("Seccionadora Aberta"))
            seccionadora89r11e = "Seccionadora Fechada";
        else if (seccionadora89r11e.equals("Seccionadora Fechada"))
            seccionadora89r11e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r23e() {
        if (seccionadora89r11e.equals("Seccionadora Fechada"))
            seccionadora89r11e = "Seccionadora Aberta";
        else if (seccionadora89r11e.equals("Seccionadora Aberta"))
            seccionadora89r11e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r22() {
        if (seccionadora89r10.equals("Seccionadora Aberta"))
            seccionadora89r10 = "Seccionadora Fechada";
        else if (seccionadora89r10.equals("Seccionadora Fechada"))
            seccionadora89r10 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r22() {
        if (seccionadora89r10.equals("Seccionadora Fechada"))
            seccionadora89r10 = "Seccionadora Aberta";
        else if (seccionadora89r10.equals("Seccionadora Aberta"))
            seccionadora89r10 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r22e() {
        if (seccionadora89r10e.equals("Seccionadora Aberta"))
            seccionadora89r10e = "Seccionadora Fechada";
        else if (seccionadora89r10e.equals("Seccionadora Fechada"))
            seccionadora89r10e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r22e() {
        if (seccionadora89r10e.equals("Seccionadora Fechada"))
            seccionadora89r10e = "Seccionadora Aberta";
        else if (seccionadora89r10e.equals("Seccionadora Aberta"))
            seccionadora89r10e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r21() {
        if (seccionadora89r9.equals("Seccionadora Aberta"))
            seccionadora89r9 = "Seccionadora Fechada";
        else if (seccionadora89r9.equals("Seccionadora Fechada"))
            seccionadora89r9 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r21() {
        if (seccionadora89r9.equals("Seccionadora Fechada"))
            seccionadora89r9 = "Seccionadora Aberta";
        else if (seccionadora89r9.equals("Seccionadora Aberta"))
            seccionadora89r9 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r21e() {
        if (seccionadora89r9e.equals("Seccionadora Aberta"))
            seccionadora89r9e = "Seccionadora Fechada";
        else if (seccionadora89r9e.equals("Seccionadora Fechada"))
            seccionadora89r9e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r21e() {
        if (seccionadora89r9e.equals("Seccionadora Fechada"))
            seccionadora89r9e = "Seccionadora Aberta";
        else if (seccionadora89r9e.equals("Seccionadora Aberta"))
            seccionadora89r9e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r20() {
        if (seccionadora89r20.equals("Seccionadora Aberta"))
            seccionadora89r20 = "Seccionadora Fechada";
        else if (seccionadora89r20.equals("Seccionadora Fechada"))
            seccionadora89r20 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r20() {
        if (seccionadora89r20.equals("Seccionadora Fechada"))
            seccionadora89r20 = "Seccionadora Aberta";
        else if (seccionadora89r20.equals("Seccionadora Aberta"))
            seccionadora89r20 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89r20e() {
        if (seccionadora89r20e.equals("Seccionadora Aberta"))
            seccionadora89r20e = "Seccionadora Fechada";
        else if (seccionadora89r20e.equals("Seccionadora Fechada"))
            seccionadora89r20e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89r20e() {
        if (seccionadora89r20e.equals("Seccionadora Fechada"))
            seccionadora89r20e = "Seccionadora Aberta";
        else if (seccionadora89r20e.equals("Seccionadora Aberta"))
            seccionadora89r20e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a7() {
        if (seccionadora89a7.equals("Seccionadora Aberta"))
            seccionadora89a7 = "Seccionadora Fechada";
        else if (seccionadora89a7.equals("Seccionadora Fechada"))
            seccionadora89a7 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a7() {
        if (seccionadora89a7.equals("Seccionadora Fechada"))
            seccionadora89a7 = "Seccionadora Aberta";
        else if (seccionadora89a7.equals("Seccionadora Aberta"))
            seccionadora89a7 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a7e() {
        if (seccionadora89a7e.equals("Seccionadora Aberta"))
            seccionadora89a7e = "Seccionadora Fechada";
        else if (seccionadora89a7e.equals("Seccionadora Fechada"))
            seccionadora89a7e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a7e() {
        if (seccionadora89a7e.equals("Seccionadora Fechada"))
            seccionadora89a7e = "Seccionadora Aberta";
        else if (seccionadora89a7e.equals("Seccionadora Aberta"))
            seccionadora89a7e = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a8() {
        if (seccionadora89a8.equals("Seccionadora Aberta"))
            seccionadora89a8 = "Seccionadora Fechada";
        else if (seccionadora89a8.equals("Seccionadora Fechada"))
            seccionadora89a8 = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a8() {
        if (seccionadora89a8.equals("Seccionadora Fechada"))
            seccionadora89a8 = "Seccionadora Aberta";
        else if (seccionadora89a8.equals("Seccionadora Aberta"))
            seccionadora89a8 = "Seccionadora Aberta";
    }

    public void fecharSeccionadora89a8e() {
        if (seccionadora89a8e.equals("Seccionadora Aberta"))
            seccionadora89a8e = "Seccionadora Fechada";
        else if (seccionadora89a8e.equals("Seccionadora Fechada"))
            seccionadora89a8e = "Seccionadora Fechada";
    }

    public void abrirSeccionadora89a8e() {
        if (seccionadora89a8e.equals("Seccionadora Fechada"))
            seccionadora89a8e = "Seccionadora Aberta";
        else if (seccionadora89a8e.equals("Seccionadora Aberta"))
            seccionadora89a8e = "Seccionadora Aberta";
    }

    public String seccionadora89c7() {
        return seccionadora89c7;
    }

    public String seccionadora89c7e() {
        return seccionadora89c7e;
    }

    public String seccionadora89c8() {
        return seccionadora89c8;
    }

    public String seccionadora89c8e() {
        return seccionadora89c8e;
    }

    public String seccionadora89r19() {
        return seccionadora89r19;
    }

    public String seccionadora89r19e() {
        return seccionadora89r19e;
    }

    public String seccionadora89lvr4() {
        return seccionadora89lvr4;
    }

    public String seccionadora89lvr4e() {
        return seccionadora89lvr4e;
    }

    public String seccionadora89ta4() {
        return seccionadora89ta4;
    }

    public String seccionadora89p6() {
        return seccionadora89p6;
    }

    public String seccionadora89p6e() {
        return seccionadora89p6e;
    }

    public String seccionadora89a7() {
        return seccionadora89a7;
    }

    public String seccionadora89a7e() {
        return seccionadora89a7e;
    }

    public String seccionadora89a8() {
        return seccionadora89a8;
    }

    public String seccionadora89a8e() {
        return seccionadora89a8e;
    }

    public String seccionadora89r24() {
        return seccionadora89r24;
    }

    public String seccionadora89r24e() {
        return seccionadora89r24e;
    }

    public String seccionadora89r23() {
        return seccionadora89r23;
    }

    public String seccionadora89r23e() {
        return seccionadora89r23e;
    }

    public String seccionadora89r22() {
        return seccionadora89r22;
    }

    public String seccionadora89r22e() {
        return seccionadora89r22e;
    }

    public String seccionadora89r21() {
        return seccionadora89r21;
    }

    public String seccionadora89r21e() {
        return seccionadora89r21e;
    }

    public String seccionadora89r20() {
        return seccionadora89r20;
    }

    public String seccionadora89r20e() {
        return seccionadora89r20e;
    }

    // �������������������������������������������� DISJUNTORES BARRA T1
    // ������������������������������������������������
    public void setCodigoDisjuntor() {
        Codigo = Codigo + 1;
    }

    public void setQuantFechamento52c1() {
        QuantFechamento52c1 = QuantFechamento52c1 + 1;
    }

    public void setQuantAbertura52c1() {
        QuantAbertura52c1 = QuantAbertura52c1 + 1;
    }

    public void setNomeDisjuntor52c1() {
        NomeDisjuntor52c1 = "Disjuntor 52 C1";
    }

    public void setManobraDisjuntor52c1() {
        ManobraDisjuntor52c1 = "Bay 52 C1";
    }

    public void fecharDisjuntor52c1() {
        if (disjuntor52c1.equals("Disjuntor Aberto"))
            disjuntor52c1 = "Disjuntor Fechado";
        else if (disjuntor52c1.equals("Disjuntor Fechado"))
            disjuntor52c1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c1() {
        if (disjuntor52c1.equals("Disjuntor Fechado"))
            disjuntor52c1 = "Disjuntor Aberto";
        else if (disjuntor52c1.equals("Disjuntor Aberto"))
            disjuntor52c1 = "Disjuntor Aberto";
    }

    public void setQuantFechamento52c2() {
        QuantFechamento52c2 = QuantFechamento52c2 + 1;
    }

    public void setQuantAbertura52c2() {
        QuantAbertura52c2 = QuantAbertura52c2 + 1;
    }

    public void setNomeDisjuntor52c2() {
        NomeDisjuntor52c2 = "Disjuntor 52 C2";
    }

    public void setManobraDisjuntor52c2() {
        ManobraDisjuntor52c2 = "Bay 52 C2";
    }

    public void fecharDisjuntor52c2() {
        if (disjuntor52c2.equals("Disjuntor Aberto"))
            disjuntor52c2 = "Disjuntor Fechado";
        else if (disjuntor52c2.equals("Disjuntor Fechado"))
            disjuntor52c2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c2() {
        if (disjuntor52c2.equals("Disjuntor Fechado"))
            disjuntor52c2 = "Disjuntor Aberto";
        else if (disjuntor52c2.equals("Disjuntor Aberto"))
            disjuntor52c2 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r6() {
        NomeDisjuntor52r6 = "Disjuntor 52 R6";
    }

    public void setManobraDisjuntor52r6() {
        ManobraDisjuntor52r6 = "Bay R6";
    }

    public void fecharDisjuntor52r6() {
        if (disjuntor52r6.equals("Disjuntor Aberto"))
            disjuntor52r6 = "Disjuntor Fechado";
        else if (disjuntor52r6.equals("Disjuntor Fechado"))
            disjuntor52r6 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r6() {
        if (disjuntor52r6.equals("Disjuntor Fechado"))
            disjuntor52r6 = "Disjuntor Aberto";
        else if (disjuntor52r6.equals("Disjuntoraberto"))
            disjuntor52r6 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52lvr1() {
        NomeDisjuntor52lvr1 = "Disjuntor 52 LVR1";
    }

    public void setManobraDisjuntor52lvr1() {
        ManobraDisjuntor52lvr1 = "Bay LVR-1";
    }

    public void fecharDisjuntor52lvr1() {
        if (disjuntor52lvr1.equals("Disjuntor Aberto"))
            disjuntor52lvr1 = "Disjuntor Fechado";
        else if (disjuntor52lvr1.equals("Disjuntor Fechado"))
            disjuntor52lvr1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52lvr1() {
        if (disjuntor52lvr1.equals("Disjuntor Fechado"))
            disjuntor52lvr1 = "Disjuntor Aberto";
        else if (disjuntor52lvr1.equals("Disjuntoraberto"))
            disjuntor52lvr1 = "Disjuntoraberto";
    }

    public void fecharDisjuntor52lvrr() {
        if (disjuntor52lvrr.equals("Disjuntor Aberto"))
            disjuntor52lvrr = "Disjuntor Fechado";
        else if (disjuntor52lvrr.equals("Disjuntor Fechado"))
            disjuntor52lvrr = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52lvrr() {
        if (disjuntor52lvrr.equals("Disjuntor Fechado"))
            disjuntor52lvrr = "Disjuntor Aberto";
        else if (disjuntor52lvrr.equals("Disjuntoraberto"))
            disjuntor52lvrr = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p1() {
        NomeDisjuntor52p1 = "Disjuntor 52 P1";
    }

    public void setManobraDisjuntor52p1() {
        ManobraDisjuntor52p1 = "Bay P1";
    }

    public void fecharDisjuntor52p1() {
        if (disjuntor52p1.equals("Disjuntor Aberto"))
            disjuntor52p1 = "Disjuntor Fechado";
        else if (disjuntor52p1.equals("Disjuntor Fechado"))
            disjuntor52p1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p1() {
        if (disjuntor52p1.equals("Disjuntor Fechado"))
            disjuntor52p1 = "Disjuntor Aberto";
        else if (disjuntor52p1.equals("Disjuntoraberto"))
            disjuntor52p1 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p2() {
        NomeDisjuntor52p2 = "Disjuntor 52 P2";
    }

    public void setManobraDisjuntor52p2() {
        ManobraDisjuntor52p2 = "Bay P2";
    }

    public void fecharDisjuntor52p2() {
        if (disjuntor52p2.equals("Disjuntor Aberto"))
            disjuntor52p2 = "Disjuntor Fechado";
        else if (disjuntor52p2.equals("Disjuntor Fechado"))
            disjuntor52p2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p2() {
        if (disjuntor52p2.equals("Disjuntor Fechado"))
            disjuntor52p2 = "Disjuntor Aberto";
        else if (disjuntor52p2.equals("Disjuntor Aberto"))
            disjuntor52p2 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52a2() {
        if (disjuntor52a2.equals("Disjuntor Aberto"))
            disjuntor52a2 = "Disjuntor Fechado";
        else if (disjuntor52a2.equals("Disjuntor Fechado"))
            disjuntor52a2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a2() {
        if (disjuntor52a2.equals("Disjuntor Fechado"))
            disjuntor52a2 = "Disjuntor Aberto";
        else if (disjuntor52a2.equals("Disjuntor Aberto"))
            disjuntor52a2 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52a1() {
        if (disjuntor52a1.equals("Disjuntor Aberto"))
            disjuntor52a1 = "Disjuntor Fechado";
        else if (disjuntor52a1.equals("Disjuntor Fechado"))
            disjuntor52a1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a1() {
        if (disjuntor52a1.equals("Disjuntor Fechado"))
            disjuntor52a1 = "Disjuntor Aberto";
        else if (disjuntor52a1.equals("Disjuntor Aberto"))
            disjuntor52a1 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52tu() {
        if (disjuntor52tu.equals("Disjuntor Aberto"))
            disjuntor52tu = "Disjuntor Fechado";
        else if (disjuntor52tu.equals("Disjuntor Fechado"))
            disjuntor52tu = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52tu() {
        if (disjuntor52tu.equals("Disjuntor Fechado"))
            disjuntor52tu = "Disjuntor Aberto";
        else if (disjuntor52tu.equals("Disjuntor Aberto"))
            disjuntor52tu = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52g1() {
        if (disjuntor52g1.equals("Disjuntor Aberto"))
            disjuntor52g1 = "Disjuntor Fechado";
        else if (disjuntor52g1.equals("Disjuntor Fechado"))
            disjuntor52g1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52g1() {
        if (disjuntor52g1.equals("Disjuntor Fechado"))
            disjuntor52g1 = "Disjuntor Aberto";
        else if (disjuntor52g1.equals("Disjuntor Aberto"))
            disjuntor52g1 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52g2() {
        if (disjuntor52g2.equals("Disjuntor Aberto"))
            disjuntor52g2 = "Disjuntor Fechado";
        else if (disjuntor52g2.equals("Disjuntor Fechado"))
            disjuntor52g2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52g2() {
        if (disjuntor52g2.equals("Disjuntor Fechado"))
            disjuntor52g2 = "Disjuntor Aberto";
        else if (disjuntor52g2.equals("Disjuntor Aberto"))
            disjuntor52g2 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r5() {
        NomeDisjuntor52r5 = "Disjuntor 52 R5";
    }

    public void setManobraDisjuntor52r5() {
        ManobraDisjuntor52r5 = "Bay R5";
    }

    public void fecharDisjuntor52r5() {
        if (disjuntor52r5.equals("Disjuntor Aberto"))
            disjuntor52r5 = "Disjuntor Fechado";
        else if (disjuntor52r5.equals("Disjuntor Fechado"))
            disjuntor52r5 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r5() {
        if (disjuntor52r5.equals("Disjuntor Fechado"))
            disjuntor52r5 = "Disjuntor Aberto";
        else if (disjuntor52r5.equals("Disjuntor Aberto"))
            disjuntor52r5 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r4() {
        NomeDisjuntor52r4 = "Disjuntor 52 R4";
    }

    public void setManobraDisjuntor52r4() {
        ManobraDisjuntor52r4 = "Bay R4";
    }

    public void fecharDisjuntor52r4() {
        if (disjuntor52r4.equals("Disjuntor Aberto"))
            disjuntor52r4 = "Disjuntor Fechado";
        else if (disjuntor52r4.equals("Disjuntor Fechado"))
            disjuntor52r4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r4() {
        if (disjuntor52r4.equals("Disjuntor Fechado"))
            disjuntor52r4 = "Disjuntor Aberto";
        else if (disjuntor52r4.equals("Disjuntor Aberto"))
            disjuntor52r4 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r3() {
        if (disjuntor52r3.equals("Disjuntor Aberto"))
            disjuntor52r3 = "Disjuntor Fechado";
        else if (disjuntor52r3.equals("Disjuntor Fechado"))
            disjuntor52r3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r3() {
        if (disjuntor52r3.equals("Disjuntor Fechado"))
            disjuntor52r3 = "Disjuntor Aberto";
        else if (disjuntor52r3.equals("Disjuntor Aberto"))
            disjuntor52r3 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r2() {
        if (disjuntor52r2.equals("Disjuntor Aberto"))
            disjuntor52r2 = "Disjuntor Fechado";
        else if (disjuntor52r2.equals("Disjuntor Fechado"))
            disjuntor52r2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r2() {
        if (disjuntor52r2.equals("Disjuntor Fechado"))
            disjuntor52r2 = "Disjuntor Aberto";
        else if (disjuntor52r2.equals("Disjuntor Aberto"))
            disjuntor52r2 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r1() {
        if (disjuntor52r1.equals("Disjuntor Aberto"))
            disjuntor52r1 = "Disjuntor Fechado";
        else if (disjuntor52r1.equals("Disjuntor Fechado"))
            disjuntor52r1 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r1() {
        if (disjuntor52r1.equals("Disjuntor Fechado"))
            disjuntor52r1 = "Disjuntor Aberto";
        else if (disjuntor52r1.equals("Disjuntor Aberto"))
            disjuntor52r1 = "Disjuntor Aberto";
    }

    public int getQuantFechamento52c1() {
        return QuantFechamento52c1;
    }

    public int getQuantAbertura52c1() {
        return QuantAbertura52c1;
    }

    public int getQuantFechamento52c2() {
        return QuantFechamento52c2;
    }

    public int getQuantAbertura52c2() {
        return QuantAbertura52c2;
    }

    public int getQuantFechamento52r6() {
        return QuantFechamento52r6;
    }

    public int getQuantAbertura52r6() {
        return QuantAbertura52r6;
    }

    public int getQuantFechamento52lvr1() {
        return QuantFechamento52lvr1;
    }

    public int getQuantAbertura52lvr1() {
        return QuantAbertura52lvr1;
    }

    public int getQuantFechamento52p1() {
        return QuantFechamento52p1;
    }

    public int getQuantAbertura52p1() {
        return QuantAbertura52p1;
    }

    public int getQuantFechamento52p2() {
        return QuantFechamento52p2;
    }

    public int getQuantAbertura52p2() {
        return QuantAbertura52p2;
    }

    public String disjuntor52c1() {
        return disjuntor52c1;
    }

    public String nomeDisjuntor52c1() {
        return NomeDisjuntor52c1;
    }

    public String manobraDisjuntor52c1() {
        return ManobraDisjuntor52c1;
    }

    public String disjuntor52c2() {
        return disjuntor52c2;
    }

    public String nomeDisjuntor52c2() {
        return NomeDisjuntor52c2;
    }

    public String manobraDisjuntor52c2() {
        return ManobraDisjuntor52c2;
    }

    public String nomeDisjuntor52r6() {
        return NomeDisjuntor52r6;
    }

    public String disjuntor52r6() {
        return disjuntor52r6;
    }

    public String disjuntor52lvr1() {
        return disjuntor52lvr1;
    }

    public String disjuntor52p1() {
        return disjuntor52p1;
    }

    public String disjuntor52p2() {
        return disjuntor52p2;
    }

    public String disjuntor52a1() {
        return disjuntor52a1;
    }

    public String disjuntor52a2() {
        return disjuntor52a2;
    }

    public String disjuntor52tu() {
        return disjuntor52tu;
    }

    public String disjuntor52g1() {
        return disjuntor52g1;
    }

    public String disjuntor52g2() {
        return disjuntor52g2;
    }

    public String disjuntor52lvrr() {
        return disjuntor52lvrr;
    }

    public String manobraDisjuntor52r6() {
        return ManobraDisjuntor52r6;
    }

    public String disjuntor52r5() {
        return disjuntor52r5;
    }

    public String disjuntor52r4() {
        return disjuntor52r4;
    }

    public String disjuntor52r3() {
        return disjuntor52r3;
    }

    public String disjuntor52r2() {
        return disjuntor52r2;
    }

    public String disjuntor52r1() {
        return disjuntor52r1;
    }

    // ����������������� DISJUNTORES DA BARRA T2 ���������������
    public void fecharDisjuntor52c3() {
        if (disjuntor52c3.equals("Disjuntor Aberto"))
            disjuntor52c3 = "Disjuntor Fechado";
        else if (disjuntor52c3.equals("Disjuntor Fechado"))
            disjuntor52c3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c3() {
        if (disjuntor52c3.equals("Disjuntor Fechado"))
            disjuntor52c3 = "Disjuntor Aberto";
        else if (disjuntor52c3.equals("Disjuntor Aberto"))
            disjuntor52c3 = "Disjuntor Aberto";
    }

    public void setQuantFechamento52c4() {
        QuantFechamento52c4 = QuantFechamento52c4 + 1;
    }

    public void setQuantAbertura52c4() {
        QuantAbertura52c4 = QuantAbertura52c4 + 1;
    }

    public void setNomeDisjuntor52c4() {
        // NomeDisjuntor52c4= "Disjuntor 52 C4";
    }

    public void setManobraDisjuntor52c4() {
        // ManobraDisjuntor52c4= "Bay 52 C4";
    }

    public void fecharDisjuntor52c4() {
        if (disjuntor52c4.equals("Disjuntor Aberto"))
            disjuntor52c4 = "Disjuntor Fechado";
        else if (disjuntor52c4.equals("Disjuntor Fechado"))
            disjuntor52c4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c4() {
        if (disjuntor52c4.equals("Disjuntor Fechado"))
            disjuntor52c4 = "Disjuntor Aberto";
        else if (disjuntor52c4.equals("Disjuntor Aberto"))
            disjuntor52c4 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r7() {
        // NomeDisjuntor52r7= "Disjuntor 52 R7";
    }

    public void setManobraDisjuntor52r7() {
        // ManobraDisjuntor52r7= "Bay R7";
    }

    public void fecharDisjuntor52r7() {
        if (disjuntor52r7.equals("Disjuntor Aberto"))
            disjuntor52r7 = "Disjuntor Fechado";
        else if (disjuntor52r7.equals("Disjuntor Fechado"))
            disjuntor52r7 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r7() {
        if (disjuntor52r7.equals("Disjuntor Fechado"))
            disjuntor52r7 = "Disjuntor Aberto";
        else if (disjuntor52r7.equals("Disjuntoraberto"))
            disjuntor52r7 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52lvr2() {
        // NomeDisjuntor52lvr2= "Disjuntor 52 LVR2";
    }

    public void setManobraDisjuntor52lvr2() {
        // ManobraDisjuntor52lvr2= "Bay LVR-2";
    }

    public void fecharDisjuntor52lvr2() {
        if (disjuntor52lvr2.equals("Disjuntor Aberto"))
            disjuntor52lvr2 = "Disjuntor Fechado";
        else if (disjuntor52lvr2.equals("Disjuntor Fechado"))
            disjuntor52lvr2 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52lvr2() {
        if (disjuntor52lvr2.equals("Disjuntor Fechado"))
            disjuntor52lvr2 = "Disjuntor Aberto";
        else if (disjuntor52lvr2.equals("Disjuntoraberto"))
            disjuntor52lvr2 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p3() {
        // NomeDisjuntor52p3= "Disjuntor 52 P3";
    }

    public void setManobraDisjuntor52p3() {
        // ManobraDisjuntor52p3= "Bay P3";
    }

    public void fecharDisjuntor52p3() {
        if (disjuntor52p3.equals("Disjuntor Aberto"))
            disjuntor52p3 = "Disjuntor Fechado";
        else if (disjuntor52p3.equals("Disjuntor Fechado"))
            disjuntor52p3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p3() {
        if (disjuntor52p3.equals("Disjuntor Fechado"))
            disjuntor52p3 = "Disjuntor Aberto";
        else if (disjuntor52p3.equals("Disjuntoraberto"))
            disjuntor52p1 = "Disjuntoraberto";
    }

    public void fecharDisjuntor52a3() {
        if (disjuntor52a3.equals("Disjuntor Aberto"))
            disjuntor52a3 = "Disjuntor Fechado";
        else if (disjuntor52a3.equals("Disjuntor Fechado"))
            disjuntor52a3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a3() {
        if (disjuntor52a3.equals("Disjuntor Fechado"))
            disjuntor52a3 = "Disjuntor Aberto";
        else if (disjuntor52a3.equals("Disjuntor Aberto"))
            disjuntor52a3 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52a4() {
        if (disjuntor52a4.equals("Disjuntor Aberto"))
            disjuntor52a4 = "Disjuntor Fechado";
        else if (disjuntor52a4.equals("Disjuntor Fechado"))
            disjuntor52a4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a4() {
        if (disjuntor52a4.equals("Disjuntor Fechado"))
            disjuntor52a4 = "Disjuntor Aberto";
        else if (disjuntor52a4.equals("Disjuntor Aberto"))
            disjuntor52a4 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r12() {
        // NomeDisjuntor52r12= "Disjuntor 52 R12";
    }

    public void setManobraDisjuntor52r12() {
        // ManobraDisjuntor52r12= "Bay R12";
    }

    public void fecharDisjuntor52r12() {
        if (disjuntor52r12.equals("Disjuntor Aberto"))
            disjuntor52r12 = "Disjuntor Fechado";
        else if (disjuntor52r12.equals("Disjuntor Fechado"))
            disjuntor52r12 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r12() {
        if (disjuntor52r12.equals("Disjuntor Fechado"))
            disjuntor52r12 = "Disjuntor Aberto";
        else if (disjuntor52r12.equals("Disjuntor Aberto"))
            disjuntor52r12 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r11() {
        // NomeDisjuntor52r11= "Disjuntor 52 R11";
    }

    public void setManobraDisjuntor52r11() {
        // ManobraDisjuntor52r11= "Bay R11";
    }

    public void fecharDisjuntor52r11() {
        if (disjuntor52r11.equals("Disjuntor Aberto"))
            disjuntor52r11 = "Disjuntor Fechado";
        else if (disjuntor52r11.equals("Disjuntor Fechado"))
            disjuntor52r11 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r11() {
        if (disjuntor52r11.equals("Disjuntor Fechado"))
            disjuntor52r11 = "Disjuntor Aberto";
        else if (disjuntor52r11.equals("Disjuntor Aberto"))
            disjuntor52r11 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r10() {
        if (disjuntor52r10.equals("Disjuntor Aberto"))
            disjuntor52r10 = "Disjuntor Fechado";
        else if (disjuntor52r10.equals("Disjuntor Fechado"))
            disjuntor52r10 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r10() {
        if (disjuntor52r10.equals("Disjuntor Fechado"))
            disjuntor52r10 = "Disjuntor Aberto";
        else if (disjuntor52r10.equals("Disjuntor Aberto"))
            disjuntor52r10 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r9() {
        if (disjuntor52r9.equals("Disjuntor Aberto"))
            disjuntor52r9 = "Disjuntor Fechado";
        else if (disjuntor52r9.equals("Disjuntor Fechado"))
            disjuntor52r9 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r9() {
        if (disjuntor52r9.equals("Disjuntor Fechado"))
            disjuntor52r9 = "Disjuntor Aberto";
        else if (disjuntor52r9.equals("Disjuntor Aberto"))
            disjuntor52r9 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r8() {
        if (disjuntor52r8.equals("Disjuntor Aberto"))
            disjuntor52r8 = "Disjuntor Fechado";
        else if (disjuntor52r8.equals("Disjuntor Fechado"))
            disjuntor52r8 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r8() {
        if (disjuntor52r8.equals("Disjuntor Fechado"))
            disjuntor52r8 = "Disjuntor Aberto";
        else if (disjuntor52r8.equals("Disjuntor Aberto"))
            disjuntor52r8 = "Disjuntor Aberto";
    }

    public String disjuntor52c3() {
        return disjuntor52c3;
    }

    public String disjuntor52c4() {
        return disjuntor52c4;
    }

    public String disjuntor52r7() {
        return disjuntor52r7;
    }

    public String disjuntor52r12() {
        return disjuntor52r12;
    }

    public String disjuntor52r11() {
        return disjuntor52r11;
    }

    public String disjuntor52r10() {
        return disjuntor52r10;
    }

    public String disjuntor52r9() {
        return disjuntor52r9;
    }

    public String disjuntor52r8() {
        return disjuntor52r8;
    }

    public String disjuntor52lvr2() {
        return disjuntor52lvr2;
    }

    public String disjuntor52p3() {
        return disjuntor52p3;
    }

    public String disjuntor52a3() {
        return disjuntor52a3;
    }

    public String disjuntor52a4() {
        return disjuntor52a4;
    }

    public String nomeDisjuntor52p2() {
        return NomeDisjuntor52p2;
    }

    public String manobraDisjuntor52p2() {
        return ManobraDisjuntor52p2;
    }

    public String nomeDisjuntor52r5() {
        return NomeDisjuntor52r5;
    }

    public String manobraDisjuntor52r5() {
        return ManobraDisjuntor52r5;
    }

    public String nomeDisjuntor52r4() {
        return NomeDisjuntor52r4;
    }

    public String manobraDisjuntor52r4() {
        return ManobraDisjuntor52r4;
    }

    // ����������� DISJUNTORES DA BARRA T3 ����������
    public void fecharDisjuntor52c5() {
        if (disjuntor52c5.equals("Disjuntor Aberto"))
            disjuntor52c5 = "Disjuntor Fechado";
        else if (disjuntor52c5.equals("Disjuntor Fechado"))
            disjuntor52c5 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c5() {
        if (disjuntor52c5.equals("Disjuntor Fechado"))
            disjuntor52c5 = "Disjuntor Aberto";
        else if (disjuntor52c5.equals("Disjuntor Aberto"))
            disjuntor52c5 = "Disjuntor Aberto";
    }

    public void setQuantFechamento52c6() {
        // QuantFechamento52c6=QuantFechamento52c6+1;
    }

    public void setQuantAbertura52c6() {
        // QuantAbertura52c6=QuantAbertura52c6+1;
    }

    public void setNomeDisjuntor52c6() {
        // NomeDisjuntor52c6= "Disjuntor 52 C6";
    }

    public void setManobraDisjuntor52c6() {
        // ManobraDisjuntor52c6= "Bay 52 C6";
    }

    public void fecharDisjuntor52c6() {
        if (disjuntor52c6.equals("Disjuntor Aberto"))
            disjuntor52c6 = "Disjuntor Fechado";
        else if (disjuntor52c6.equals("Disjuntor Fechado"))
            disjuntor52c6 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c6() {
        if (disjuntor52c6.equals("Disjuntor Fechado"))
            disjuntor52c6 = "Disjuntor Aberto";
        else if (disjuntor52c6.equals("Disjuntor Aberto"))
            disjuntor52c6 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r13() {
        // NomeDisjuntor52r13= "Disjuntor 52 R13";
    }

    public void setManobraDisjuntor52r13() {
        // ManobraDisjuntor52r13= "Bay R13";
    }

    public void fecharDisjuntor52r13() {
        if (disjuntor52r13.equals("Disjuntor Aberto"))
            disjuntor52r13 = "Disjuntor Fechado";
        else if (disjuntor52r13.equals("Disjuntor Fechado"))
            disjuntor52r13 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r13() {
        if (disjuntor52r13.equals("Disjuntor Fechado"))
            disjuntor52r13 = "Disjuntor Aberto";
        else if (disjuntor52r13.equals("Disjuntoraberto"))
            disjuntor52r13 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52lvr3() {
        // NomeDisjuntor52lvr2= "Disjuntor 52 LVR2";
    }

    public void setManobraDisjuntor52lvr3() {
        // ManobraDisjuntor52lvr2= "Bay LVR-2";
    }

    public void fecharDisjuntor52lvr3() {
        if (disjuntor52lvr3.equals("Disjuntor Aberto"))
            disjuntor52lvr3 = "Disjuntor Fechado";
        else if (disjuntor52lvr3.equals("Disjuntor Fechado"))
            disjuntor52lvr3 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52lvr3() {
        if (disjuntor52lvr3.equals("Disjuntor Fechado"))
            disjuntor52lvr3 = "Disjuntor Aberto";
        else if (disjuntor52lvr3.equals("Disjuntoraberto"))
            disjuntor52lvr3 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p4() {
        // NomeDisjuntor52p3= "Disjuntor 52 P3";
    }

    public void setManobraDisjuntor52p4() {
        // ManobraDisjuntor52p3= "Bay P3";
    }

    public void fecharDisjuntor52p4() {
        if (disjuntor52p4.equals("Disjuntor Aberto"))
            disjuntor52p4 = "Disjuntor Fechado";
        else if (disjuntor52p4.equals("Disjuntor Fechado"))
            disjuntor52p4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p4() {
        if (disjuntor52p4.equals("Disjuntor Fechado"))
            disjuntor52p4 = "Disjuntor Aberto";
        else if (disjuntor52p4.equals("Disjuntoraberto"))
            disjuntor52p4 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p5() {
        // NomeDisjuntor52p3= "Disjuntor 52 P3";
    }

    public void setManobraDisjuntor52p5() {
        // ManobraDisjuntor52p3= "Bay P3";
    }

    public void fecharDisjuntor52p5() {
        if (disjuntor52p5.equals("Disjuntor Aberto"))
            disjuntor52p5 = "Disjuntor Fechado";
        else if (disjuntor52p5.equals("Disjuntor Fechado"))
            disjuntor52p5 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p5() {
        if (disjuntor52p5.equals("Disjuntor Fechado"))
            disjuntor52p5 = "Disjuntor Aberto";
        else if (disjuntor52p5.equals("Disjuntoraberto"))
            disjuntor52p5 = "Disjuntoraberto";
    }

    public void fecharDisjuntor52a5() {
        if (disjuntor52a5.equals("Disjuntor Aberto"))
            disjuntor52a5 = "Disjuntor Fechado";
        else if (disjuntor52a5.equals("Disjuntor Fechado"))
            disjuntor52a5 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a5() {
        if (disjuntor52a5.equals("Disjuntor Fechado"))
            disjuntor52a5 = "Disjuntor Aberto";
        else if (disjuntor52a5.equals("Disjuntor Aberto"))
            disjuntor52a5 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52a6() {
        if (disjuntor52a6.equals("Disjuntor Aberto"))
            disjuntor52a6 = "Disjuntor Fechado";
        else if (disjuntor52a6.equals("Disjuntor Fechado"))
            disjuntor52a6 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a6() {
        if (disjuntor52a6.equals("Disjuntor Fechado"))
            disjuntor52a6 = "Disjuntor Aberto";
        else if (disjuntor52a6.equals("Disjuntor Aberto"))
            disjuntor52a6 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r18() {
        // NomeDisjuntor52r12= "Disjuntor 52 R12";
    }

    public void setManobraDisjuntor52r18() {
        // ManobraDisjuntor52r12= "Bay R12";
    }

    public void fecharDisjuntor52r18() {
        if (disjuntor52r18.equals("Disjuntor Aberto"))
            disjuntor52r18 = "Disjuntor Fechado";
        else if (disjuntor52r18.equals("Disjuntor Fechado"))
            disjuntor52r18 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r18() {
        if (disjuntor52r18.equals("Disjuntor Fechado"))
            disjuntor52r18 = "Disjuntor Aberto";
        else if (disjuntor52r18.equals("Disjuntor Aberto"))
            disjuntor52r18 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r17() {
        // NomeDisjuntor52r11= "Disjuntor 52 R11";
    }

    public void setManobraDisjuntor52r17() {
        // ManobraDisjuntor52r11= "Bay R11";
    }

    public void fecharDisjuntor52r17() {
        if (disjuntor52r17.equals("Disjuntor Aberto"))
            disjuntor52r17 = "Disjuntor Fechado";
        else if (disjuntor52r17.equals("Disjuntor Fechado"))
            disjuntor52r17 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r17() {
        if (disjuntor52r17.equals("Disjuntor Fechado"))
            disjuntor52r17 = "Disjuntor Aberto";
        else if (disjuntor52r17.equals("Disjuntor Aberto"))
            disjuntor52r17 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r16() {
        if (disjuntor52r16.equals("Disjuntor Aberto"))
            disjuntor52r16 = "Disjuntor Fechado";
        else if (disjuntor52r16.equals("Disjuntor Fechado"))
            disjuntor52r16 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r16() {
        if (disjuntor52r16.equals("Disjuntor Fechado"))
            disjuntor52r16 = "Disjuntor Aberto";
        else if (disjuntor52r16.equals("Disjuntor Aberto"))
            disjuntor52r16 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r15() {
        if (disjuntor52r15.equals("Disjuntor Aberto"))
            disjuntor52r15 = "Disjuntor Fechado";
        else if (disjuntor52r15.equals("Disjuntor Fechado"))
            disjuntor52r15 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r15() {
        if (disjuntor52r15.equals("Disjuntor Fechado"))
            disjuntor52r15 = "Disjuntor Aberto";
        else if (disjuntor52r15.equals("Disjuntor Aberto"))
            disjuntor52r15 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r14() {
        if (disjuntor52r14.equals("Disjuntor Aberto"))
            disjuntor52r14 = "Disjuntor Fechado";
        else if (disjuntor52r14.equals("Disjuntor Fechado"))
            disjuntor52r14 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r14() {
        if (disjuntor52r14.equals("Disjuntor Fechado"))
            disjuntor52r14 = "Disjuntor Aberto";
        else if (disjuntor52r14.equals("Disjuntor Aberto"))
            disjuntor52r14 = "Disjuntor Aberto";
    }

    public String disjuntor52c5() {
        return disjuntor52c5;
    }

    public String disjuntor52c6() {
        return disjuntor52c6;
    }

    public String disjuntor52r13() {
        return disjuntor52r13;
    }

    public String disjuntor52r18() {
        return disjuntor52r18;
    }

    public String disjuntor52r17() {
        return disjuntor52r17;
    }

    public String disjuntor52r16() {
        return disjuntor52r16;
    }

    public String disjuntor52r15() {
        return disjuntor52r15;
    }

    public String disjuntor52r14() {
        return disjuntor52r14;
    }

    public String disjuntor52lvr3() {
        return disjuntor52lvr3;
    }

    public String disjuntor52p4() {
        return disjuntor52p4;
    }

    public String disjuntor52p5() {
        return disjuntor52p5;
    }

    public String disjuntor52a5() {
        return disjuntor52a5;
    }

    public String disjuntor52a6() {
        return disjuntor52a6;
    }

    // ����������������� DISJUNTORES DA BARRA T4 ���������������

    public void fecharDisjuntor52c7() {
        if (disjuntor52c7.equals("Disjuntor Aberto"))
            disjuntor52c7 = "Disjuntor Fechado";
        else if (disjuntor52c7.equals("Disjuntor Fechado"))
            disjuntor52c7 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c7() {
        if (disjuntor52c7.equals("Disjuntor Fechado"))
            disjuntor52c7 = "Disjuntor Aberto";
        else if (disjuntor52c7.equals("Disjuntor Aberto"))
            disjuntor52c7 = "Disjuntor Aberto";
    }

    public void setQuantFechamento52c8() {
        QuantFechamento52c8 = QuantFechamento52c8 + 1;
    }

    public void setQuantAbertura52c8() {
        QuantAbertura52c8 = QuantAbertura52c8 + 1;
    }

    public void setNomeDisjuntor52c8() {
        NomeDisjuntor52c8 = "Disjuntor 52 C8";
    }

    public void setManobraDisjuntor52c8() {
        ManobraDisjuntor52c8 = "Bay 52 C8";
    }

    public void fecharDisjuntor52c8() {
        if (disjuntor52c8.equals("Disjuntor Aberto"))
            disjuntor52c8 = "Disjuntor Fechado";
        else if (disjuntor52c8.equals("Disjuntor Fechado"))
            disjuntor52c8 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52c8() {
        if (disjuntor52c8.equals("Disjuntor Fechado"))
            disjuntor52c8 = "Disjuntor Aberto";
        else if (disjuntor52c8.equals("Disjuntor Aberto"))
            disjuntor52c8 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r19() {
        NomeDisjuntor52r19 = "Disjuntor 52 R19";
    }

    public void setManobraDisjuntor52r19() {
        ManobraDisjuntor52r19 = "Bay R19";
    }

    public void fecharDisjuntor52r19() {
        if (disjuntor52r19.equals("Disjuntor Aberto"))
            disjuntor52r19 = "Disjuntor Fechado";
        else if (disjuntor52r19.equals("Disjuntor Fechado"))
            disjuntor52r19 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r19() {
        if (disjuntor52r19.equals("Disjuntor Fechado"))
            disjuntor52r19 = "Disjuntor Aberto";
        else if (disjuntor52r19.equals("Disjuntoraberto"))
            disjuntor52r19 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52lvr4() {
        NomeDisjuntor52lvr4 = "Disjuntor 52 LVR4";
    }

    public void setManobraDisjuntor52lvr4() {
        ManobraDisjuntor52lvr4 = "Bay LVR-4";
    }

    public void fecharDisjuntor52lvr4() {
        if (disjuntor52lvr4.equals("Disjuntor Aberto"))
            disjuntor52lvr4 = "Disjuntor Fechado";
        else if (disjuntor52lvr4.equals("Disjuntor Fechado"))
            disjuntor52lvr4 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52lvr4() {
        if (disjuntor52lvr4.equals("Disjuntor Fechado"))
            disjuntor52lvr4 = "Disjuntor Aberto";
        else if (disjuntor52lvr4.equals("Disjuntoraberto"))
            disjuntor52lvr4 = "Disjuntoraberto";
    }

    public void setNomeDisjuntor52p6() {
        NomeDisjuntor52p6 = "Disjuntor 52 P6";
    }

    public void setManobraDisjuntor52p6() {
        ManobraDisjuntor52p6 = "Bay P6";
    }

    public void fecharDisjuntor52p6() {
        if (disjuntor52p6.equals("Disjuntor Aberto"))
            disjuntor52p6 = "Disjuntor Fechado";
        else if (disjuntor52p6.equals("Disjuntor Fechado"))
            disjuntor52p6 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52p6() {
        if (disjuntor52p6.equals("Disjuntor Fechado"))
            disjuntor52p6 = "Disjuntor Aberto";
        else if (disjuntor52p6.equals("Disjuntoraberto"))
            disjuntor52p6 = "Disjuntoraberto";
    }

    public void fecharDisjuntor52a7() {
        if (disjuntor52a7.equals("Disjuntor Aberto"))
            disjuntor52a7 = "Disjuntor Fechado";
        else if (disjuntor52a7.equals("Disjuntor Fechado"))
            disjuntor52a7 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a7() {
        if (disjuntor52a7.equals("Disjuntor Fechado"))
            disjuntor52a7 = "Disjuntor Aberto";
        else if (disjuntor52a7.equals("Disjuntor Aberto"))
            disjuntor52a7 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52a8() {
        if (disjuntor52a8.equals("Disjuntor Aberto"))
            disjuntor52a8 = "Disjuntor Fechado";
        else if (disjuntor52a8.equals("Disjuntor Fechado"))
            disjuntor52a8 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52a8() {
        if (disjuntor52a8.equals("Disjuntor Fechado"))
            disjuntor52a8 = "Disjuntor Aberto";
        else if (disjuntor52a8.equals("Disjuntor Aberto"))
            disjuntor52a8 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r24() {
        NomeDisjuntor52r24 = "Disjuntor 52 R24";
    }

    public void setManobraDisjuntor52r24() {
        ManobraDisjuntor52r24 = "Bay R24";
    }

    public void fecharDisjuntor52r24() {
        if (disjuntor52r24.equals("Disjuntor Aberto"))
            disjuntor52r24 = "Disjuntor Fechado";
        else if (disjuntor52r24.equals("Disjuntor Fechado"))
            disjuntor52r24 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r24() {
        if (disjuntor52r24.equals("Disjuntor Fechado"))
            disjuntor52r24 = "Disjuntor Aberto";
        else if (disjuntor52r24.equals("Disjuntor Aberto"))
            disjuntor52r24 = "Disjuntor Aberto";
    }

    public void setNomeDisjuntor52r23() {
        NomeDisjuntor52r23 = "Disjuntor 52 R23";
    }

    public void setManobraDisjuntor52r23() {
        ManobraDisjuntor52r23 = "Bay R23";
    }

    public void fecharDisjuntor52r23() {
        if (disjuntor52r23.equals("Disjuntor Aberto"))
            disjuntor52r23 = "Disjuntor Fechado";
        else if (disjuntor52r23.equals("Disjuntor Fechado"))
            disjuntor52r23 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r23() {
        if (disjuntor52r23.equals("Disjuntor Fechado"))
            disjuntor52r23 = "Disjuntor Aberto";
        else if (disjuntor52r23.equals("Disjuntor Aberto"))
            disjuntor52r23 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r22() {
        if (disjuntor52r22.equals("Disjuntor Aberto"))
            disjuntor52r22 = "Disjuntor Fechado";
        else if (disjuntor52r22.equals("Disjuntor Fechado"))
            disjuntor52r22 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r22() {
        if (disjuntor52r22.equals("Disjuntor Fechado"))
            disjuntor52r22 = "Disjuntor Aberto";
        else if (disjuntor52r22.equals("Disjuntor Aberto"))
            disjuntor52r22 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r21() {
        if (disjuntor52r21.equals("Disjuntor Aberto"))
            disjuntor52r21 = "Disjuntor Fechado";
        else if (disjuntor52r21.equals("Disjuntor Fechado"))
            disjuntor52r21 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r21() {
        if (disjuntor52r21.equals("Disjuntor Fechado"))
            disjuntor52r21 = "Disjuntor Aberto";
        else if (disjuntor52r21.equals("Disjuntor Aberto"))
            disjuntor52r21 = "Disjuntor Aberto";
    }

    public void fecharDisjuntor52r20() {
        if (disjuntor52r20.equals("Disjuntor Aberto"))
            disjuntor52r20 = "Disjuntor Fechado";
        else if (disjuntor52r20.equals("Disjuntor Fechado"))
            disjuntor52r20 = "Disjuntor Fechado";
    }

    public void abrirDisjuntor52r20() {
        if (disjuntor52r20.equals("Disjuntor Fechado"))
            disjuntor52r20 = "Disjuntor Aberto";
        else if (disjuntor52r20.equals("Disjuntor Aberto"))
            disjuntor52r20 = "Disjuntor Aberto";
    }

    public String disjuntor52c7() {
        return disjuntor52c7;
    }

    public String disjuntor52c8() {
        return disjuntor52c8;
    }

    public String disjuntor52r19() {
        return disjuntor52r19;
    }

    public String disjuntor52r24() {
        return disjuntor52r24;
    }

    public String disjuntor52r23() {
        return disjuntor52r23;
    }

    public String disjuntor52r22() {
        return disjuntor52r22;
    }

    public String disjuntor52r21() {
        return disjuntor52r21;
    }

    public String disjuntor52r20() {
        return disjuntor52r20;
    }

    public String disjuntor52lvr4() {
        return disjuntor52lvr4;
    }

    public String disjuntor52p6() {
        return disjuntor52p6;
    }

    public String disjuntor52a7() {
        return disjuntor52a7;
    }

    public String disjuntor52a8() {
        return disjuntor52a8;
    }

    public String nomeDisjuntor52p6() {
        return NomeDisjuntor52p6;
    }

    public String manobraDisjuntor52p6() {
        return ManobraDisjuntor52p6;
    }

    public String nomeDisjuntor52r23() {
        return NomeDisjuntor52r23;
    }

    public String manobraDisjuntor52r23() {
        return ManobraDisjuntor52r23;
    }

    public String nomeDisjuntor52r22() {
        return NomeDisjuntor52r22;
    }

    public String manobraDisjuntor52r22() {
        return ManobraDisjuntor52r22;
    }

    public String nomeDisjuntor52r21() {
        return NomeDisjuntor52r21;
    }

    public String manobraDisjuntor52r21() {
        return ManobraDisjuntor52r21;
    }

    public String nomeDisjuntor52r20() {
        return NomeDisjuntor52r20;
    }

    public String manobraDisjuntor52r20() {
        return ManobraDisjuntor52r20;
    }

    // �������������� TRANSFORMADORES DA BARRA T1��������������������
    private int tapslvr1, tapslvr1a, tapslvrr, tapslvr2, tapslvr2a, tapslvr3, tapslvr3a;

    // ������������� TRANSFORMADOR LVR-1 ��������������������
    public void setNomeTransformadorlvr1() {
        NomeTransformadorlvr1 = "Transformador LVR-1";
    }

    public void setManobraTransformadorlvr1() {
        ManobraTransformadorlvr1 = "Bay 52 LVR-1";
    }

    public void ligarTransformadorlvr1() {
        if (transformadorlvr1.equals("Transformador Desligado"))
            transformadorlvr1 = "Transformador Ligado";
        else if (transformadorlvr1.equals("Transformador Ligado"))
            transformadorlvr1 = "Transformador Ligado";
    }

    public void desligarTransformadorlvr1() {
        if (transformadorlvr1.equals("Transformador Ligado"))
            transformadorlvr1 = "Transformador Desligado";
        else if (transformadorlvr1.equals("Transformador Desligado"))
            transformadorlvr1 = "Transformador Desligado";
    }

    public String getLigarTransformadorlvr1() {
        return transformadorlvr1;
    }

    public String getDesligarTransformadorlvr1() {
        return transformadorlvr1;
    }

    public void aumentarTaplvr1() {
        if (tapslvr1 < 32)
            tapslvr1++;
        if (tapslvr1 < 32)
            transformadorlvr1 = "Elevado Tap";
    }

    public void diminuirTaplvr1() {
        if (tapslvr1 > 0)
            tapslvr1--;
        if (tapslvr1 >= 0)
            transformadorlvr1 = "Reduzido Tap";
    }

    public String getValorTaplvr1() {
        String saida = "";
        switch (tapslvr1) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr1() {
        return tapslvr1;
    }

    public String getMostrarTapslvr1() {
        String mostrar = "";
        switch (tapslvr1) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String nomeTransformadorlvr1() {
        return NomeTransformadorlvr1;
    }

    public String manobraTransformadorlvr1() {
        return ManobraTransformadorlvr1;
    }

    public String elevadoTaplvr1() {
        return transformadorlvr1;
    }

    public String reduzidoTaplvr1() {
        return transformadorlvr1;
    }

    // ��������������������������������� TRANSFORMADOR LVR-1A
    // ������������������������������������

    public void setNomeTransformadorlvr1a() {
        NomeTransformadorlvr1a = "Transformador LVR-1A";
    }

    public void setManobraTransformadorlvr1a() {
        ManobraTransformadorlvr1a = "Bay 52 LVR-1A";
    }

    public void ligarTransformadorlvr1a() {
        if (transformadorlvr1a.equals("Transformador Desligado"))
            transformadorlvr1a = "Transformador Ligado";
        else if (transformadorlvr1a.equals("Transformador Ligado"))
            transformadorlvr1a = "Transformador Ligado";
    }

    public void desligarTransformadorlvr1a() {
        if (transformadorlvr1a.equals("Transformador Ligado"))
            transformadorlvr1a = "Transformador Desligado";
        else if (transformadorlvr1a.equals("Transformador Desligado"))
            transformadorlvr1a = "Transformador Desligado";
    }

    public void aumentarTaplvr1a() {
        if (tapslvr1a < 32)
            tapslvr1a++;
        if (tapslvr1a < 32)
            transformadorlvr1a = "Elevado Tap";
    }

    public void diminuirTaplvr1a() {
        if (tapslvr1a > 0)
            tapslvr1a--;
        if (tapslvr1a >= 0)
            transformadorlvr1a = "Reduzido Tap";
    }

    public String getValorTaplvr1a() {
        String saida = "";
        switch (tapslvr1a) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr1a() {
        return tapslvr1a;
    }

    public String getMostrarTapslvr1a() {
        String mostrar = "";
        switch (tapslvr1a) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public int getQuantSubir() {
        return QuantOperaçoes;
    }

    public int getQuantDescer() {
        return QuantOperaçoes;
    }

    public void setQuantSubir() {
        QuantOperaçoes = QuantOperaçoes + 1;
    }

    public void setQuantDescer() {
        QuantOperaçoes = QuantOperaçoes + 1;
    }

    public String getLigarTransformadorlvr1a() {
        return transformadorlvr1a;
    }

    public String getDesligarTransformadorlvr1a() {
        return transformadorlvr1a;
    }

    public String nomeTransformadorlvr1a() {
        return NomeTransformadorlvr1a;
    }

    public String manobraTransformadorlvr1a() {
        return ManobraTransformadorlvr1a;
    }

    public String elevadoTaplvr1a() {
        return transformadorlvr1a;
    }

    public String reduzidoTaplvr1a() {
        return transformadorlvr1a;
    }

    // ��������������������������������� TRANSFORMADOR LVR-R
    // ������������������������������������

    public void aumentarTaplvrr() {
        if (tapslvrr < 32)
            tapslvrr++;
        if (tapslvrr < 32)
            transformadorlvrr = "Elevado Tap";
    }

    public void diminuirTaplvrr() {
        if (tapslvrr > 0)
            tapslvrr--;
        if (tapslvrr >= 0)
            transformadorlvrr = "Reduzido Tap";
    }

    public String getValorTaplvrr() {
        String saida = "";
        switch (tapslvrr) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvrr() {
        return tapslvr1;
    }

    public String getMostrarTapslvrr() {
        String mostrar = "";
        switch (tapslvrr) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    // ����������� TRANSFORMADOR LVR-2 �������������
    public void setNomeTransformadorlvr2() {
        NomeTransformadorlvr2 = "Transformador LVR-2";
    }

    public void setManobraTransformadorlvr2() {
        ManobraTransformadorlvr2 = "Bay 52 LVR-2";
    }

    public void ligarTransformadorlvr2() {
        if (transformadorlvr2.equals("Transformador Desligado"))
            transformadorlvr2 = "Transformador Ligado";
        else if (transformadorlvr2.equals("Transformador Ligado"))
            transformadorlvr2 = "Transformador Ligado";
    }

    public void desligarTransformadorlvr2() {
        if (transformadorlvr2.equals("Transformador Ligado"))
            transformadorlvr2 = "Transformador Desligado";
        else if (transformadorlvr2.equals("Transformador Desligado"))
            transformadorlvr2 = "Transformador Desligado";
    }

    public String getLigarTransformadorlvr2() {
        return transformadorlvr2;
    }

    public String getDesligarTransformadorlvr2() {
        return transformadorlvr2;
    }

    public void aumentarTaplvr2() {
        if (tapslvr2 < 32)
            tapslvr2++;
        if (tapslvr2 < 32)
            transformadorlvr2 = "Elevado Tap";
    }

    public void diminuirTaplvr2() {
        if (tapslvr2 > 0)
            tapslvr2--;
        if (tapslvr2 >= 0)
            transformadorlvr2 = "Reduzido Tap";
    }

    public String getValorTaplvr2() {
        String saida = "";
        switch (tapslvr2) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr2() {
        return tapslvr2;
    }

    public String getMostrarTapslvr2() {
        String mostrar = "";
        switch (tapslvr2) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String nomeTransformadorlvr2() {
        return NomeTransformadorlvr2;
    }

    public String manobraTransformadorlvr2() {
        return ManobraTransformadorlvr2;
    }

    public String elevadoTaplvr2() {
        return transformadorlvr2;
    }

    public String reduzidoTaplvr2() {
        return transformadorlvr2;
    }

    // ������������ TRANSFORMADOR LVR-2A ������������

    public void setNomeTransformadorlvr2a() {
        NomeTransformadorlvr2a = "Transformador LVR-2A";
    }

    public void setManobraTransformadorlvr2a() {
        ManobraTransformadorlvr2a = "Bay 52 LVR-2A";
    }

    public void ligarTransformadorlvr2a() {
        if (transformadorlvr2a.equals("Transformador Desligado"))
            transformadorlvr2a = "Transformador Ligado";
        else if (transformadorlvr2a.equals("Transformador Ligado"))
            transformadorlvr2a = "Transformador Ligado";
    }

    public void desligarTransformadorlvr2a() {
        if (transformadorlvr2a.equals("Transformador Ligado"))
            transformadorlvr2a = "Transformador Desligado";
        else if (transformadorlvr2a.equals("Transformador Desligado"))
            transformadorlvr2a = "Transformador Desligado";
    }

    public void aumentarTaplvr2a() {
        if (tapslvr2a < 32)
            tapslvr2a++;
        if (tapslvr2a < 32)
            transformadorlvr2a = "Elevado Tap";
    }

    public void diminuirTaplvr2a() {
        if (tapslvr2a > 0)
            tapslvr2a--;
        if (tapslvr2a >= 0)
            transformadorlvr2a = "Reduzido Tap";
    }

    public String getValorTaplvr2a() {
        String saida = "";
        switch (tapslvr2a) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr2a() {
        return tapslvr2a;
    }

    public String getMostrarTapslvr2a() {
        String mostrar = "";
        switch (tapslvr2a) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String getLigarTransformadorlvr2a() {
        return transformadorlvr2a;
    }

    public String getDesligarTransformadorlvr2a() {
        return transformadorlvr2a;
    }

    public String nomeTransformadorlvr2a() {
        return NomeTransformadorlvr2a;
    }

    public String manobraTransformadorlvr2a() {
        return ManobraTransformadorlvr2a;
    }

    public String elevadoTaplvr2a() {
        return transformadorlvr2a;
    }

    public String reduzidoTaplvr2a() {
        return transformadorlvr2a;
    }

    // ��������� TRANSFORMADOR LVR-3 ������������
    public void setNomeTransformadorlvr3() {
        NomeTransformadorlvr3 = "Transformador LVR-3";
    }

    public void setManobraTransformadorlvr3() {
        ManobraTransformadorlvr2 = "Bay 52 LVR-3";
    }

    public void ligarTransformadorlvr3() {
        if (transformadorlvr3.equals("Transformador Desligado"))
            transformadorlvr3 = "Transformador Ligado";
        else if (transformadorlvr3.equals("Transformador Ligado"))
            transformadorlvr3 = "Transformador Ligado";
    }

    public void desligarTransformadorlvr3() {
        if (transformadorlvr3.equals("Transformador Ligado"))
            transformadorlvr3 = "Transformador Desligado";
        else if (transformadorlvr3.equals("Transformador Desligado"))
            transformadorlvr3 = "Transformador Desligado";
    }

    public String getLigarTransformadorlvr3() {
        return transformadorlvr3;
    }

    public String getDesligarTransformadorlvr3() {
        return transformadorlvr3;
    }

    public void aumentarTaplvr3() {
        if (tapslvr3 < 32)
            tapslvr3++;
        if (tapslvr3 < 32)
            transformadorlvr3 = "Elevado Tap";
    }

    public void diminuirTaplvr3() {
        if (tapslvr3 > 0)
            tapslvr3--;
        if (tapslvr3 >= 0)
            transformadorlvr3 = "Reduzido Tap";
    }

    public String getValorTaplvr3() {
        String saida = "";
        switch (tapslvr3) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr3() {
        return tapslvr3;
    }

    public String getMostrarTapslvr3() {
        String mostrar = "";
        switch (tapslvr3) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String nomeTransformadorlvr3() {
        return NomeTransformadorlvr3;
    }

    public String manobraTransformadorlvr3() {
        return ManobraTransformadorlvr3;
    }

    public String elevadoTaplvr3() {
        return transformadorlvr3;
    }

    public String reduzidoTaplvr3() {
        return transformadorlvr3;
    }

    // ����������� TRANSFORMADOR LVR-3A ��������������

    public void setNomeTransformadorlvr3a() {
        NomeTransformadorlvr3a = "Transformador LVR-3A";
    }

    public void setManobraTransformadorlvr3a() {
        ManobraTransformadorlvr3a = "Bay 52 LVR-3A";
    }

    public void ligarTransformadorlvr3a() {
        if (transformadorlvr3a.equals("Transformador Desligado"))
            transformadorlvr3a = "Transformador Ligado";
        else if (transformadorlvr3a.equals("Transformador Ligado"))
            transformadorlvr3a = "Transformador Ligado";
    }

    public void desligarTransformadorlvr3a() {
        if (transformadorlvr3a.equals("Transformador Ligado"))
            transformadorlvr3a = "Transformador Desligado";
        else if (transformadorlvr3a.equals("Transformador Desligado"))
            transformadorlvr3a = "Transformador Desligado";
    }

    public void aumentarTaplvr3a() {
        if (tapslvr3a < 32)
            tapslvr3a++;
        if (tapslvr3a < 32)
            transformadorlvr2a = "Elevado Tap";
    }

    public void diminuirTaplvr3a() {
        if (tapslvr3a > 0)
            tapslvr3a--;
        if (tapslvr3a >= 0)
            transformadorlvr3a = "Reduzido Tap";
    }

    public String getValorTaplvr3a() {
        String saida = "";
        switch (tapslvr3a) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr3a() {
        return tapslvr3a;
    }

    public String getMostrarTapslvr3a() {
        String mostrar = "";
        switch (tapslvr3a) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String getLigarTransformadorlvr3a() {
        return transformadorlvr3a;
    }

    public String getDesligarTransformadorlvr3a() {
        return transformadorlvr3a;
    }

    public String nomeTransformadorlvr3a() {
        return NomeTransformadorlvr3a;
    }

    public String manobraTransformadorlvr3a() {
        return ManobraTransformadorlvr3a;
    }

    public String elevadoTaplvr3a() {
        return transformadorlvr3a;
    }

    public String reduzidoTaplvr3a() {
        return transformadorlvr3a;
    }

    // ����������� TRANSFORMADOR LVR-4 �������������
    public void setNomeTransformadorlvr4() {
        NomeTransformadorlvr2 = "Transformador LVR-2";
    }

    public void setManobraTransformadorlvr4() {
        ManobraTransformadorlvr2 = "Bay 52 LVR-2";
    }

    public void ligarTransformadorlvr4() {
        if (transformadorlvr2.equals("Transformador Desligado"))
            transformadorlvr2 = "Transformador Ligado";
        else if (transformadorlvr2.equals("Transformador Ligado"))
            transformadorlvr2 = "Transformador Ligado";
    }

    public void desligarTransformadorlvr4() {
        if (transformadorlvr2.equals("Transformador Ligado"))
            transformadorlvr2 = "Transformador Desligado";
        else if (transformadorlvr2.equals("Transformador Desligado"))
            transformadorlvr2 = "Transformador Desligado";
    }

    public String getLigarTransformadorlvr4() {
        return transformadorlvr2;
    }

    public String getDesligarTransformadorlvr4() {
        return transformadorlvr2;
    }

    public void aumentarTaplvr4() {
        if (tapslvr2 < 32)
            tapslvr2++;
        if (tapslvr2 < 32)
            transformadorlvr2 = "Elevado Tap";
    }

    public void diminuirTaplvr4() {
        if (tapslvr2 > 0)
            tapslvr2--;
        if (tapslvr2 >= 0)
            transformadorlvr2 = "Reduzido Tap";
    }

    public String getValorTaplvr4() {
        String saida = "";
        switch (tapslvr2) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr4() {
        return tapslvr2;
    }

    public String getMostrarTapslvr4() {
        String mostrar = "";
        switch (tapslvr2) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String nomeTransformadorlvr4() {
        return NomeTransformadorlvr2;
    }

    public String manobraTransformadorlvr4() {
        return ManobraTransformadorlvr2;
    }

    public String elevadoTaplvr4() {
        return transformadorlvr2;
    }

    public String reduzidoTaplvr4() {
        return transformadorlvr2;
    }

    // ������������ TRANSFORMADOR LVR-4A ������������

    public void setNomeTransformadorlvr4a() {
        NomeTransformadorlvr2a = "Transformador LVR-2A";
    }

    public void setManobraTransformadorlvr4a() {
        ManobraTransformadorlvr2a = "Bay 52 LVR-2A";
    }

    public void ligarTransformadorlvr4a() {
        if (transformadorlvr2a.equals("Transformador Desligado"))
            transformadorlvr2a = "Transformador Ligado";
        else if (transformadorlvr2a.equals("Transformador Ligado"))
            transformadorlvr2a = "Transformador Ligado";
    }

    public void desligarTransformadorlvr4a() {
        if (transformadorlvr2a.equals("Transformador Ligado"))
            transformadorlvr2a = "Transformador Desligado";
        else if (transformadorlvr2a.equals("Transformador Desligado"))
            transformadorlvr2a = "Transformador Desligado";
    }

    public void aumentarTaplvr4a() {
        if (tapslvr2a < 32)
            tapslvr2a++;
        if (tapslvr2a < 32)
            transformadorlvr2a = "Elevado Tap";
    }

    public void diminuirTaplvr4a() {
        if (tapslvr2a > 0)
            tapslvr2a--;
        if (tapslvr2a >= 0)
            transformadorlvr2a = "Reduzido Tap";
    }

    public String getValorTaplvr4a() {
        String saida = "";
        switch (tapslvr2a) {
            case 0:
                saida = "20.1 kV";
                break;
            case 1:
                saida = "20.5 kV";
                break;
            case 2:
                saida = "21.0 kV";
                break;
            case 3:
                saida = "21.4 kV";
                break;
            case 4:
                saida = "21.9 kV";
                break;
            case 5:
                saida = "22.3 kV";
                break;
            case 6:
                saida = "22.8 kV";
                break;
            case 7:
                saida = "23.2 kV";
                break;
            case 8:
                saida = "23.7 kV";
                break;
            case 9:
                saida = "24.1 kV";
                break;
            case 10:
                saida = "24.6 kV";
                break;
            case 11:
                saida = "25.0 kV";
                break;
            case 12:
                saida = "25.5 kV";
                break;
            case 13:
                saida = "25.9 kV";
                break;
            case 14:
                saida = "26.4 kV";
                break;
            case 15:
                saida = "26.8 kV";
                break;
            case 16:
                saida = "27.3 kV";
                break;
            case 17:
                saida = "27.7 kV";
                break;
            case 18:
                saida = "28.2 kV";
                break;
            case 19:
                saida = "28.6 kV";
                break;
            case 20:
                saida = "29.1 kV";
                break;
            case 21:
                saida = "29.5 kV";
                break;
            case 22:
                saida = "30.0 kV";
                break;
            case 23:
                saida = "30.4 kV";
                break;
            case 24:
                saida = "30.9 kV";
                break;
            case 25:
                saida = "31.3 kV";
                break;
            case 26:
                saida = "31.8 kV";
                break;
            case 27:
                saida = "32.2 kV";
                break;
            case 28:
                saida = "32.7 kV";
                break;
            case 29:
                saida = "33.1 kV";
                break;
            case 30:
                saida = "33.6 kV";
                break;
            case 31:
                saida = "34.0 kV";
                break;
            case 32:
                saida = "34.5 kV";
                break;
        }
        return saida;
    }

    public int getTapslvr4a() {
        return tapslvr2a;
    }

    public String getMostrarTapslvr4a() {
        String mostrar = "";
        switch (tapslvr2a) {
            case 0:
                mostrar = "Tap 1";
                break;
            case 1:
                mostrar = "Tap 2";
                break;
            case 2:
                mostrar = "Tap 3";
                break;
            case 3:
                mostrar = "Tap 4";
                break;
            case 4:
                mostrar = "Tap 5";
                break;
            case 5:
                mostrar = "Tap 6";
                break;
            case 6:
                mostrar = "Tap 7";
                break;
            case 7:
                mostrar = "Tap 8";
                break;
            case 8:
                mostrar = "Tap 9";
                break;
            case 9:
                mostrar = "Tap 10";
                break;
            case 10:
                mostrar = "Tap 11";
                break;
            case 11:
                mostrar = "Tap 12";
                break;
            case 12:
                mostrar = "Tap 13";
                break;
            case 13:
                mostrar = "Tap 14";
                break;
            case 14:
                mostrar = "Tap 15";
                break;
            case 15:
                mostrar = "Tap 16";
                break;
            case 16:
                mostrar = "Tap 17";
                break;
            case 17:
                mostrar = "Tap 18";
                break;
            case 18:
                mostrar = "Tap 19";
                break;
            case 19:
                mostrar = "Tap 20";
                break;
            case 20:
                mostrar = "Tap 21";
                break;
            case 21:
                mostrar = "Tap 22";
                break;
            case 22:
                mostrar = "Tap 23";
                break;
            case 23:
                mostrar = "Tap 24";
                break;
            case 24:
                mostrar = "Tap 25";
                break;
            case 25:
                mostrar = "Tap 26";
                break;
            case 26:
                mostrar = "Tap 27";
                break;
            case 27:
                mostrar = "Tap 28";
                break;
            case 28:
                mostrar = "Tap 29";
                break;
            case 29:
                mostrar = "Tap 30";
                break;
            case 30:
                mostrar = "Tap 31";
                break;
            case 31:
                mostrar = "Tap 32";
                break;
            case 32:
                mostrar = "Tap 33";
                break;
        }
        return mostrar;
    }

    public String getLigarTransformadorlvr4a() {
        return transformadorlvr2a;
    }

    public String getDesligarTransformadorlvr4a() {
        return transformadorlvr2a;
    }

    public String nomeTransformadorlvr4a() {
        return NomeTransformadorlvr2a;
    }

    public String manobraTransformadorlvr4a() {
        return ManobraTransformadorlvr2a;
    }

    public String elevadoTaplvr4a() {
        return transformadorlvr2a;
    }

    public String reduzidoTaplvr4a() {
        return transformadorlvr2a;
    }

}