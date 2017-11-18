/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.spec.visualitzarEpisodi;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import app.VisualitzarEpisodi;

/**
 *
 * @author sergiplanes
 */
@RunWith(ConcordionRunner.class)
public class VisualitzarEpisodiTest {

    public boolean isValidTest() {

        VisualitzarEpisodi view = new VisualitzarEpisodi();

        return view.validateEpisodi();

    }

}
