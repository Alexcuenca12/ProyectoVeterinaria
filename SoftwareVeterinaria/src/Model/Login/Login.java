package Model.Login;

import Model.ConectionPg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {

    private boolean acceso;
    ConectionPg cpg = new ConectionPg();

    public int VerificarIngreso(String cedula, String contraseña) {
        System.out.println(cedula + contraseña);
        //Acceso 1=false, 2=Admin, 3=veterinario
        int acceso = 1;
        if (cedula.equals("123") && contraseña.equals("123")) {
            acceso = 2;
        } else {
            try {
                //Sentencia
                String sql = "Select * from Veterinario where id_medico='" + cedula + "' and contra='" + contraseña + "'";
                ResultSet rs = cpg.consulta(sql);
                if (rs.next()) {
                    acceso = 3;
                } else {
                    JOptionPane.showMessageDialog(null, "La cedula o la contraseña es incorrecta");
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return acceso;
    }
}
