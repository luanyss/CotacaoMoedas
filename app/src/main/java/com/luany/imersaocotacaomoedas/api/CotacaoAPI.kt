package com.luany.imersaocotacaomoedas.api

import okhttp3.Response
import retrofit2.http.GET

interface CotacaoAPI {

    /*
     * https://www.mercadobitcoin.net/api/  + BTC/ticker/
     */

    //https://www.mercadobitcoin.net/api/  + BTC/ticker/
    @GET("BTC/ticker/")
    //usa-se suspend fun para executar uma tarefa asssincrona utilizando corotinas
    suspend fun recuperarCotacaoBitcoin(): retrofit2.Response<Cotacao>

    //https://www.mercadobitcoin.net/api/  + ETH/ticker/
    @GET("ETH/ticker/")
    //usa-se para executar uma tarefa asssincrona utilizando corotinas
    suspend fun recuperarCotacaoEthereum(): retrofit2.Response<Cotacao>
}