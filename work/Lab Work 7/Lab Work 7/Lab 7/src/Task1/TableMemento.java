package Task1;

import java.util.*;

public class TableMemento implements java.io.Serializable {
    private List columnIdentifiers;
    private List dataList;

    TableMemento(ArrayList columnIdentifiers, ArrayList dataList) {

    }

    ArrayList getColumnIdentifiers()	{
        throw new UnsupportedOperationException();
    }

    ArrayList getDataVector() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
	return "[ci=" + columnIdentifiers.toString() + "\n" + "dl=" + dataList.toString() + "]";
    }
}