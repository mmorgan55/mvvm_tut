package mmorgan.tutorial.android.myapplication.ui.quotes

import androidx.lifecycle.ViewModel
import mmorgan.tutorial.android.myapplication.data.Quote
import mmorgan.tutorial.android.myapplication.data.QuoteRepository

class  QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}