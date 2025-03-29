import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Clase SlotGame que representa el juego de tragamonedas.
 * Extiende JFrame para la interfaz gráfica.
 * Utiliza botones, etiquetas y paneles para construir la interfaz de usuario.
 * Incluye un mecanismo de aleatorización para simular los rodillos de la
 * tragamonedas.
 */
public class SlotGame extends JFrame {
    private JLabel[] reels = new JLabel[3];// Etiquetas que representan los rodillos de la tragamonedas
    private JLabel resultLabel;//etiqueta que muestra el mensaje de resultado
    private JButton spinButton;//boton para iniciar a girar los rodillos
    private String[] symbols = { "img1.jpg", "img2.jpg", "img3.jpg", "img4.jpg", "img5.jpg" };
    private Random random = new Random();

    /**
     * Constructor de la clase SlotGame.
     * Configura la ventana del juego y los componentes de la interfaz gráfica.
     */
    public SlotGame() {
        setTitle("Tragamonedas");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel principal para los rodillos
        JPanel slotPanel = new JPanel(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            reels[i] = new JLabel();
            reels[i].setHorizontalAlignment(JLabel.CENTER);
            reels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            slotPanel.add(reels[i]);
        }
        add(slotPanel, BorderLayout.CENTER);

        // Panel inferior con mensaje y botón
        JPanel bottomPanel = new JPanel(new BorderLayout());
        //resultados del juego
        resultLabel = new JLabel("Presiona girar", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        resultLabel.setForeground(Color.RED);
        bottomPanel.add(resultLabel, BorderLayout.CENTER);

        spinButton = new JButton("Girar");
        spinButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        spinButton.setForeground(Color.blue);
        spinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                spin();
            }
        });
        bottomPanel.add(spinButton, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void spin() {
        String[] selectedSymbols = new String[3];
        for (int i = 0; i < 3; i++) {
            selectedSymbols[i] = symbols[random.nextInt(symbols.length)];
            ImageIcon icon = new ImageIcon(selectedSymbols[i]);
            Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            reels[i].setIcon(new ImageIcon(img));
        }
        //condicion con la que se verifica cuandon se gana o se pierde 
        if (selectedSymbols[0].equals(selectedSymbols[1]) && selectedSymbols[1].equals(selectedSymbols[2])) {
            resultLabel.setText("¡GANAAAAASTE!");
        } else {
            resultLabel.setText("PERDISTEEE!!");
        }
    }
    //main para ejecutar el codigo 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SlotGame().setVisible(true);
        });
    }
}
