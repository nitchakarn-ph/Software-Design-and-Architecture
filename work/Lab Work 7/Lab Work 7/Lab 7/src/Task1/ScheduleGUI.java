package Task1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ScheduleGUI extends JFrame {  
    private TableMemento memento;
    private ScheduleTableModel tableModel;

    private Object[][] data = {
		{"08.00-09.00", "----", "Math", "", "", ""},
		{"09.00-10.00", "", "Math", "", "", ""},
		{"10.00-11.00", "", "", "SE 2", "", "Math"},
		{"11.00-12.00", "", "", "SE 2", "", "Math"},
		{"12.00-13.00", "----", "----", "----", "----", "----"},
		{"13.00-14.00", "SE 2", "OpSys", "", "", ""},
		{"14.00-15.00", "SE 2", "OpSys", "", "Project", ""},
		{"15.00-16.00", "", "OpSys", "", "Project", ""},
		{"16.00-17.00", "", "OpSys", "", "Project", ""},
		{"17.00-18.00", "", "", "", "Project", ""}
	};

    private String[] columnNames = {
		"Time", 
		"Monday",
		"Tuesday",
		"Wednesday",
		"Thursday",
		"Friday"
    };

    public ScheduleGUI() {
		super("Schedule GUI with Memento");
		initComponents();
		pack();
    }

    protected void initComponents() {
        addWindowListener (new WindowAdapter () {
            public void windowClosing (WindowEvent evt) {
                exitForm (evt);
            }
        });

		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener( new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				exitMenuItemActionPerformed (e);
	        }
		});

		fileMenu.add(exitMenuItem);
		mb.add(fileMenu);
		setJMenuBar(mb);

		tableModel = new ScheduleTableModel(data, columnNames);
		
	    final JTable table = new JTable(tableModel);
	    table.setPreferredScrollableViewportSize(new Dimension(500, 70));
	    
	    JScrollPane scrollPane = new JScrollPane(table);
	    getContentPane().add(scrollPane, BorderLayout.CENTER);
	    
		JButton newButton = new JButton("Snapshot");
		newButton.setPreferredSize(new Dimension(125, 27));
		newButton.addActionListener (new ActionListener () {
			public void actionPerformed (ActionEvent evt) {
			
			}
	    });
	        
		JButton revertButton = new JButton("Revert");
		revertButton.setPreferredSize(new Dimension(125, 27));
	        revertButton.addActionListener (new ActionListener () {
	            public void actionPerformed (ActionEvent evt) {
	
	            }
	        }
	     );
	        
		JPanel panel = new JPanel();
		panel.add(newButton);
		panel.add(revertButton);
		getContentPane().add(panel, BorderLayout.SOUTH);
    }

    protected void exitMenuItemActionPerformed (ActionEvent evt) {
        System.exit(0);
    }

    protected void exitForm(WindowEvent e) {
        System.exit (0);
    }

    public static void main (String[] args) {
        new ScheduleGUI().setVisible (true);
    }   
}