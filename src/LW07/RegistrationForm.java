package LW07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class RegistrationForm extends JFrame implements ActionListener {

    // --- Components for the Form ---
    private JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel;
    private JTextField nameField, mobileField;
    private JRadioButton maleRadio, femaleRadio;
    private ButtonGroup genderGroup; // To group radio buttons
    private JComboBox<String> dayCombo, monthCombo, yearCombo;
    private JTextArea addressArea;
    private JCheckBox termsCheckBox;
    private JButton submitButton, resetButton;
    private JTextArea outputArea; // For displaying registration details

    // Constructor to set up the GUI
    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(800, 500); // Increased width to accommodate output
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Use a GridBagLayout for more flexible positioning
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL; // Components expand horizontally

        // --- Title ---
        JLabel formTitle = new JLabel("Registration Form");
        formTitle.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4; // Span across all columns
        gbc.anchor = GridBagConstraints.CENTER;
        add(formTitle, gbc);

        // Reset gridwidth for subsequent components
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 0; // Don't give extra horizontal space by default

        // --- Name ---
        nameLabel = new JLabel("Name");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nameLabel, gbc);

        nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.5; // Give this field horizontal space
        add(nameField, gbc);

        // --- Mobile ---
        mobileLabel = new JLabel("Mobile");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        add(mobileLabel, gbc);

        mobileField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        add(mobileField, gbc);

        // --- Gender ---
        genderLabel = new JLabel("Gender");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        add(genderLabel, gbc);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        maleRadio.setSelected(true); // Default selection

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 0.5;
        add(genderPanel, gbc);

        // --- DOB ---
        dobLabel = new JLabel("DOB");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        add(dobLabel, gbc);

        // Day ComboBox
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        dayCombo = new JComboBox<>(days);

        // Month ComboBox
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthCombo = new JComboBox<>(months);
        monthCombo.setSelectedItem("Jan"); // Default to Jan

        // Year ComboBox (e.g., last 100 years from current)
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        String[] years = new String[100];
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(currentYear - i);
        }
        yearCombo = new JComboBox<>(years);
        yearCombo.setSelectedItem("1995"); // Set default year as in image

        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        dobPanel.add(dayCombo);
        dobPanel.add(monthCombo);
        dobPanel.add(yearCombo);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 0.5;
        add(dobPanel, gbc);

        // --- Address ---
        addressLabel = new JLabel("Address");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 0;
        add(addressLabel, gbc);

        addressArea = new JTextArea(4, 20); // 4 rows, 20 columns
        addressArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(addressArea); // Add scroll for address
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH; // Allow textarea to expand
        add(scrollPane, gbc);

        // --- Terms and Conditions ---
        termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 0; // Don't give extra horizontal space to checkbox
        gbc.fill = GridBagConstraints.NONE; // Don't expand checkbox
        gbc.anchor = GridBagConstraints.WEST; // Align to left
        add(termsCheckBox, gbc);

        // --- Buttons ---
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        // Add action listeners to buttons
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        add(buttonPanel, gbc);

        // --- Output Area (on the right) ---
        outputArea = new JTextArea(15, 25); // Rows, columns
        outputArea.setEditable(false); // Make it read-only
        outputArea.setLineWrap(true);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        gbc.gridx = 2; // Start from column 2
        gbc.gridy = 1; // Align with Name field
        gbc.gridheight = 7; // Span multiple rows
        gbc.gridwidth = 2; // Span 2 columns
        gbc.weightx = 0.5; // Give output area lots of horizontal space
        gbc.weighty = 1.0; // Give output area vertical space
        gbc.fill = GridBagConstraints.BOTH; // Fill available space
        add(outputScrollPane, gbc);

        setVisible(true);
    }

    // --- Event Handling for Buttons ---
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            handleSubmit();
        } else if (e.getSource() == resetButton) {
            handleReset();
        }
    }

    private void handleSubmit() {
        if (!termsCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this,
                    "Please accept the Terms And Conditions to register.",
                    "Terms Not Accepted", JOptionPane.WARNING_MESSAGE);
            return; // Stop processing if terms are not accepted
        }

        // Gather all the input data
        String name = nameField.getText();
        String mobile = mobileField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String dobDay = (String) dayCombo.getSelectedItem();
        String dobMonth = (String) monthCombo.getSelectedItem();
        String dobYear = (String) yearCombo.getSelectedItem();
        String address = addressArea.getText();

        // Format and display in the output area
        StringBuilder output = new StringBuilder();
        output.append("Name : ").append(name).append("\n");
        output.append("Mobile : ").append(mobile).append("\n");
        output.append("Gender : ").append(gender).append("\n");
        output.append("DOB : ").append(dobDay).append("/").append(dobMonth).append("/").append(dobYear).append("\n");
        output.append("Address : ").append(address).append("\n");

        outputArea.setText(output.toString());

        // As per the image, show "Registration Successfully.."
        // This could be a new JLabel or a JOptionPane. I'll use a JLabel here for simplicity
        // For the purpose of this example, let's just append to a dedicated status label or the output area.
        // For the image's "Registration Successfully.." text, we'll put it in the output area initially.
        // In a real app, you might have a separate JLabel at the bottom for status messages.
        outputArea.append("\nRegistration Successfully..");
    }

    private void handleReset() {
        nameField.setText("");
        mobileField.setText("");
        maleRadio.setSelected(true); // Reset gender to Male
        dayCombo.setSelectedIndex(0); // Reset day to 1
        monthCombo.setSelectedItem("Jan"); // Reset month to Jan
        yearCombo.setSelectedItem("1995"); // Reset year to 1995
        addressArea.setText("");
        termsCheckBox.setSelected(false);
        outputArea.setText(""); // Clear the output area
    }

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (EDT)
        // This is crucial for Swing applications to ensure thread safety.
        SwingUtilities.invokeLater(() -> new RegistrationForm());
    }
}