package mmorgan.tutorial.android.myapplication.utilities

import mmorgan.tutorial.android.myapplication.data.FakeDatabase
import mmorgan.tutorial.android.myapplication.data.QuoteRepository
import mmorgan.tutorial.android.myapplication.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun providesQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}