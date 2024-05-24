package Praktikum7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarUlang extends JFrame{
    private JLabel lbJudul, lbNamaLengkap, lbTanggalLahir, lbNomorPendaftaran, lbNoTelp, lbAlamat, lbEmail;
    private JTextField txtNamaLengkap, txtTanggalLahir, txtNomorPendaftaran, txtNoTelp, txtEmail; 
    private JTextArea txtAlamat;
    private JButton btnSubmit;
    public DaftarUlang() {
        setLayout(null);
        lbJudul = new JLabel("Formulir Pendaftaran Mahasiswa");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 18));
        add(lbJudul);
        lbJudul.setBounds(51, 14, 300, 20);
        lbNamaLengkap = new JLabel("Nama Lengkap");
        add(lbNamaLengkap);
        lbNamaLengkap.setBounds(10, 50, 100, 20);
        lbTanggalLahir = new JLabel("Tanggal Lahir");
        add(lbTanggalLahir);
        lbTanggalLahir.setBounds(10, 80, 100, 20);
        lbNomorPendaftaran = new JLabel("Nomor Pendaftaran");
        add(lbNomorPendaftaran);
        lbNomorPendaftaran.setBounds(10, 110, 150, 20);
        lbNoTelp = new JLabel("No. Telp");
        add(lbNoTelp);
        lbNoTelp.setBounds(10, 140, 100, 20);
        lbAlamat = new JLabel("Alamat");
        add(lbAlamat);
        lbAlamat.setBounds(10, 170, 100, 20);
        lbEmail = new JLabel("Email");
        add(lbEmail);
        lbEmail.setBounds(10, 230, 100, 20);
        txtNamaLengkap = new JTextField();
        add(txtNamaLengkap);
        txtNamaLengkap.setBounds(140, 50, 220, 20);
        txtTanggalLahir = new JTextField();
        add(txtTanggalLahir);
        txtTanggalLahir.setBounds(140, 80, 220, 20);
        txtNomorPendaftaran = new JTextField();
        add(txtNomorPendaftaran);
        txtNomorPendaftaran.setBounds(140, 110, 220, 20);
        txtNoTelp = new JTextField();
        add(txtNoTelp);
        txtNoTelp.setBounds(140, 140, 220, 20);
        txtAlamat = new JTextArea();
        add(txtAlamat);
        txtAlamat.setBounds(144, 170, 212, 50);
        txtEmail = new JTextField();
        add(txtEmail);
        txtEmail.setBounds(140, 230, 220, 20);
        btnSubmit = new JButton("Submit");
        add(btnSubmit);
        btnSubmit.setBounds(150, 278, 100, 20);
        btnSubmit.addActionListener(new MainAction());
        setTitle("Form Pendaftaran Ulang Mahasiswa Baru");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public boolean isFormValid() {
        return !txtNamaLengkap.getText().isEmpty() &&
               !txtTanggalLahir.getText().isEmpty() &&
               !txtNomorPendaftaran.getText().isEmpty() &&
               !txtNoTelp.getText().isEmpty() &&
               !txtAlamat.getText().isEmpty() &&
               !txtEmail.getText().isEmpty();
    }
    public class MainAction implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if (isFormValid()) {
                int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
                if (response == JOptionPane.OK_OPTION) {
                    showConfirmationWindow();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public void showConfirmationWindow() {
        JFrame confirmationFrame = new JFrame("Data Pendaftaran");
        confirmationFrame.setSize(400, 350);
        confirmationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        confirmationFrame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        lbJudul = new JLabel("Data Mahasiswa");
        lbJudul.setFont(new Font("Arial", Font.BOLD, 16));
        lbJudul.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lbJudul);
        JTextArea textArea = new JTextArea(17,30);
        textArea.setText(
            "Nama Lengkap         : " + txtNamaLengkap.getText() + "\n" +
            "Tanggal Lahir           : " + txtTanggalLahir.getText() + "\n" +
            "Nomor Pendaftaran  : " + txtNomorPendaftaran.getText() + "\n" +
            "No. Telp                   : " + txtNoTelp.getText() + "\n" +
            "Alamat                     : " + txtAlamat.getText() + "\n" +
            "Email                        : " + txtEmail.getText()
        );
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        panel.add(textArea);
        textArea.setEditable(false);
        confirmationFrame.add(panel);
        confirmationFrame.setVisible(true);
    }
}