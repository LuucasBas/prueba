package controllers;

import ejerciciofx_03.Persona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AppController implements Initializable {

    @FXML
    private TextField txtNombre;
    
    @FXML
    private TextField txtApellido;
    
    @FXML
    private TextField txtDni;
    
    @FXML
    private RadioButton rdMasculino;
    
    @FXML
    private RadioButton rdFemenino;
    
    @FXML
    private Button btnCerrar;
    
    @FXML
    private Button btnGuardar;
    
    @FXML
    private Label lblMensaje;
    
    private ToggleGroup tgGenero;
    
    @FXML
    private void cerrar(){
        
    }
    
    @FXML
    private void guardar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
//            System.out.println(this.txtNombre.getText());
//            System.out.println(this.txtApellido.getText());
//            System.out.println(this.txtDni.getText());
//            this.lblMensaje.setText("Datos guardados.");
//            File f = new File ("temp");
//            if(!f.exists()){
//                f.mkdir();
//            }
//            File nota = new File("temp","nota.txt");
//            FileWriter fw;
//            BufferedWriter bw = null;
//            try{
//                fw = new FileWriter(nota, true);
//                bw = new BufferedWriter(fw);
//                bw.write("Texto generado desde el codigo.");
//                bw.newLine();
//                bw.write("Segunda linea escrita.");
//                bw.newLine();
//            } catch (Exception e){
//                System.out.println("Error al escribir el archivo.");
//            } finally {
//                try {
//                    if(bw != null){
//                        bw.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            
//            File lectura = new File("temp", "lectura.txt");
//            FileReader fr = null;
//            BufferedReader br = null;
//            try{ 
//                fr = new FileReader(lectura);
//                br = new BufferedReader(fr);
//                
//                try {
//                    String s;
//                    while((s = br.readLine()) != null){
//                        System.out.println(s);
//                    }
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//                
//            } catch (FileNotFoundException ex){
//                ex.printStackTrace();
//            } finally {
//                try {
//                    if(fr != null){
//                        fr.close();
//                    }
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
            
//            Persona p = new Persona("Emma");
//            
//            List<Persona> personas = new ArrayList<>();
//            FileOutputStream fos = null;
//            ObjectOutputStream oos = null;
//            
//            try {
//                fos = new FileOutputStream("persona.dat");
//                oos = new ObjectOutputStream(fos);
//                
//                oos.writeObject(p);
//                
//                
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            } finally {
//                try {
//                    oos.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//          
            Persona persona1 = new Persona("Emma");
            Persona persona2 = new Persona("Thomas");
            Persona persona3 = new Persona("Martin");
            Persona persona4 = new Persona("Elian");
            File f = new File("personas.dat");
            if(!f.exists()){
                f.createNewFile();
                FileOutputStream fos = new FileOutputStream("personas.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(new ArrayList<Persona>());
            } else {
                FileInputStream fis = new FileInputStream(f);;
                ObjectInputStream ois = new ObjectInputStream(fis);;
                
                List<Persona> p = (List<Persona>) ois.readObject();
                System.out.println("");
                p.add(persona1);
                p.add(persona2);
                p.add(persona3);
                p.add(persona4);
                System.out.println(p.toString());
            
            }
                  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tgGenero = new ToggleGroup();
        this.rdMasculino.setToggleGroup(tgGenero);
        this.rdFemenino.setToggleGroup(tgGenero);
        
        
        
    }    
    
}
