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
    public boolean validateEpisodi(ArrayList <String> serie) {
        String episodi1 = "Primer Capitol";
        serie.add(episodi1);
        return !serie.isEmpty();
    }

}
