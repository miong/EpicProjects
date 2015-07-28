package common.testProject.ormPart;

import com.j256.ormlite.dao.CloseableIterator;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DAO {

	public static void main(String[] args) {
		try {
			String databaseUrl = "jdbc:sqlite:databases/database.db";
			// create a connection source to our database
			ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

			// instantiate the DAO to handle Data with String id
			Dao<Data, String> accountDao = DaoManager.createDao(connectionSource, Data.class);

			// if you need to create the 'dataTable' table make this call
			TableUtils.createTableIfNotExists(connectionSource, Data.class);

			// create an instance of Data
			int id = (int) (Math.random() * 10000000);
			Data account = new Data(id, "_secret__" + id);

			// persist the data object to the database
			accountDao.createOrUpdate(account);

			// retrieve the data
			Data account2 = accountDao.queryForId(Integer.toString(id));
			// show its password
			System.out.println("Data added this run is : " + account2.getString() + " " + account2.getList().get(0));

			System.out.println("PRINT DATABASE : ");
			CloseableIterator<Data> it = accountDao.iterator();
			while(it.hasNext())
			{
				Data data = it.next();
				System.out.println("Data in database : "+ data.getString() + " " + data.getList().get(0));
			}
			
			// close the connection source
			connectionSource.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
