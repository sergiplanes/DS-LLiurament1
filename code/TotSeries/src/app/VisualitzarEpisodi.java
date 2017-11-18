/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author sergiplanes
 */
public class VisualitzarEpisodi {
    public boolean validateEpisodi() {
        ArrayList <String> serie = new ArrayList();
        String episodi1 = "Cap1";
        serie.add(episodi1);
        boolean trobat = !serie.isEmpty();
        return trobat;
    }
}
