package t4tsi.github.android_lista_compra.data

import androidx.room.Database
import androidx.room.RoomDatabase
import t4tsi.github.android_lista_compra.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}