package common.testProject.ormPart;

import java.util.ArrayList;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "dataTable")
public class Data {

	@DatabaseField(id = true)
	private int integer;

	@DatabaseField(canBeNull = false)
	private String string;

	@DatabaseField(canBeNull = false, dataType = DataType.SERIALIZABLE)
	private ArrayList<Integer> list;

	public Data() {
		// ORM CALL BACKS
	}

	public Data(int a, String b) {
		integer = a;
		string = b;
		list = new ArrayList<Integer>();
		list.add(integer);
	}

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

}
