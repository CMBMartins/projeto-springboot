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
 * MODULO -   OPERA�OES                                *
 ******************************************************/
public class Operaçoes
{
  private int CodigoOperaçao= 0;
  private String TipoOperaçao;
  private String TagEquipamento;
  private String DataOperaçao;
   
  public Operaçoes()
  {}
  
  public void setCodigoOperaçao ()
  {
      CodigoOperaçao= CodigoOperaçao+1;
  }
    
  public void setTipoOperaçao (String tipooperaçao)
  {
      TipoOperaçao= tipooperaçao;
  }
  
  public void setTagEquipamento (String tagequipamento)
  {
      TagEquipamento= tagequipamento;
  }  
  
   public void setDataOperaçao (String dataoperaçao)
   {
      DataOperaçao= dataoperaçao;
   }
     
    public int getCodigoOperaçao()
    {
        return CodigoOperaçao;
    }
    
    public String getTipoOperaçao()
    {
        return TipoOperaçao;
    }
    
    public String getTagEquipamento()
    {
        return TagEquipamento;
    }
    
    public String getDataOperaçao()
    {
        return DataOperaçao;
    }
}