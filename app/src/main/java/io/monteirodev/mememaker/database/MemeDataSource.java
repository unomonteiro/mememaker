package io.monteirodev.mememaker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import io.monteirodev.mememaker.models.Meme;
import io.monteirodev.mememaker.models.MemeAnnotation;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Evan Anger on 8/17/14.
 */
public class MemeDataSource {

    private Context mContext;
    private MemeSQLiteHelper mMemeSqlLiteHelper;

    public MemeDataSource(Context context) {
        mContext = context;
    }
}
