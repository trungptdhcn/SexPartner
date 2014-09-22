package com.example.SexPartner.backend.model.ormlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.example.SexPartner.backend.model.Friend;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper
{
// ------------------------------ FIELDS ------------------------------

    private static final int DATABASE_VERSION = 1;
    public static String DATABASE_NAME = "SEX_PARTNER.db";
    private Context context;
    private Dao<Friend, String> friendDAO;

// --------------------------- CONSTRUCTORS ---------------------------

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public Dao<Friend, String> getVehicleDAO() throws SQLException
    {
        if (friendDAO == null)
        {
            friendDAO = getDao(Friend.class);
            ((BaseDaoImpl) friendDAO).initialize();
        }
        return friendDAO;
    }


// -------------------------- OTHER METHODS --------------------------

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource)
    {
        try
        {
            TableUtils.createTable(connectionSource, Friend.class);
        }
        catch (SQLException e)
        {
            Log.e(this.getClass().getName(), e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int oldVersion,
                          int newVersion)
    {
        try
        {
            TableUtils.dropTable(connectionSource, Friend.class, true);
            TableUtils.createTable(connectionSource, Friend.class);

        }
        catch (SQLException e)
        {
        }
    }

    public void dropAllDatabase() throws SQLException
    {
        TableUtils.dropTable(connectionSource, Friend.class, true);

    }

    public void createTables() throws SQLException
    {
        TableUtils.createTable(connectionSource, Friend.class);
    }
}
