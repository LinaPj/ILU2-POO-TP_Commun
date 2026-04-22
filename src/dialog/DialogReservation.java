package dialog;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import control.ControlReservationRestaurant;
import model.ReservationRestaurant;

public class DialogReservation {

    private ControlReservationRestaurant control;

    public void initDialog() {
        control = new ControlReservationRestaurant();
    }

    public void eventReservation(int jour, int mois, int service, int table) {

        ReservationRestaurant r = control.reserver(jour, mois, service, table);

        JOptionPane.showMessageDialog(null, r.toString());
    }

    public static void main(String[] args) {

        DialogReservation dialog = new DialogReservation();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dialog.initDialog();

                    dialog.eventReservation(10, 12, 1, 3);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}