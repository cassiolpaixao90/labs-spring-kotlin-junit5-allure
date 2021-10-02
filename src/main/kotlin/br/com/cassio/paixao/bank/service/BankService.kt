package br.com.cassio.paixao.bank.service

import br.com.cassio.paixao.bank.datasource.BankDataSource
import br.com.cassio.paixao.bank.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}