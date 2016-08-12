/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;



public class Exportar {
    private String cromosomas[]=new String[10];
    private String cromosomasMutados[]=new String[10];
    private String encabezados[]={"Individuos","Mutados"};
    
    public Exportar(String[] cromosomas, String[] cromosomasMutados){
        this.cromosomas=cromosomas;
        this.cromosomasMutados=cromosomasMutados;
        
    }
    public String exportarExcel(){
        String respuesta="No se pudo exportar";
        Workbook libro=new HSSFWorkbook();
        Sheet hoja= libro.createSheet("Resultados");
        String file="Resultado.xls";

        try{
           for(int i=-1;i<10;i++){
               Row fila=hoja.createRow(i+1);
               for(int j=0;j<2;j++){
                   Cell celda=fila.createCell(j);
                   if(i==-1){
                       celda.setCellValue(encabezados[j]);
                   }
                   else{
                       if(j==0){
                        celda.setCellValue(cromosomas[i]);
                       }
                       else{
                        celda.setCellValue(cromosomasMutados[i]);   
                       }
                   }
                   libro.write(new FileOutputStream(file));
               }
           }
        respuesta="Exportacion exitosa";
        }catch(Exception e){
            System.err.print(e);
        }
        return respuesta; 
    }
    
}
