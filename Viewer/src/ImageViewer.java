import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ImageViewer extends JFrame {

    private JLabel imageLabel;

    public ImageViewer() {
        super("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new OpenActionListener());
        fileMenu.add(openMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scrollPane = new JScrollPane(imageLabel);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private class OpenActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new ImageFileFilter());
            int option = fileChooser.showOpenDialog(ImageViewer.this);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    Image image = ImageIO.read(file);
                    imageLabel.setIcon(new ImageIcon(image));
                    pack();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(ImageViewer.this, "Error opening image",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private class ImageFileFilter extends javax.swing.filechooser.FileFilter {
        public boolean accept(File file) {
            if (file.isDirectory()) {
                return true;
            }
            String extension = getExtension(file);
            if (extension != null) {
                return extension.equals("jpeg") || extension.equals("jpg");
            }
            return false;
        }

        @Override
        public String getDescription() {
            return "JPEG Images (*.jpeg, *.jpg)";
        }

        private String getExtension(File file) {
            String extension = null;
            String fileName = file.getName();
            int dotIndex = fileName.lastIndexOf('.');
            if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
                extension = fileName.substring(dotIndex + 1).toLowerCase();
            }
            return extension;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ImageViewer app = new ImageViewer();
                app.setVisible(true);
            }
        });
    }
}