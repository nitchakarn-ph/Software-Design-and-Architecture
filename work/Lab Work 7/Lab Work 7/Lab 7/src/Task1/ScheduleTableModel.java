package Task1;

import javax.swing.table.*;

public class ScheduleTableModel extends DefaultTableModel {
    public ScheduleTableModel(Object[][] data, Object[] columnNames) {
    	super(data, columnNames);
    }

    public TableMemento createMemento() {
        throw new UnsupportedOperationException();
    }

    public void setMemento(TableMemento memento) {
        throw new UnsupportedOperationException();
    }
}
