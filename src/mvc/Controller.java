package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View v;
    private Model m;

    public Controller(View v1, Model m1) {
        v = v1;
        m = m1;

        v.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int p, q = 0;

            try {
                p = v.getP();
                q = v.getQ();

                m.add(p, q);
                v.setCalcSolution(m.getResult());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                v.displayErrorMessage("Need 2 int");
            }
        }
    }
}