package io.horizontalsystems.bankwallet.modules.multiswap.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import io.horizontalsystems.bankwallet.R
import io.horizontalsystems.bankwallet.modules.multiswap.QuoteInfoRow
import io.horizontalsystems.bankwallet.modules.send.SendModule
import io.horizontalsystems.bankwallet.ui.compose.components.subhead2_grey
import io.horizontalsystems.bankwallet.ui.compose.components.subhead2_leah

// todo: remove this class if it's unused
data class SwapDataFieldFee(val feeAmountData: SendModule.AmountData) : SwapDataField {
    @Composable
    override fun GetContent(navController: NavController) {
        QuoteInfoRow(
            title = {
                subhead2_grey(text = stringResource(R.string.Swap_Fee))
            },
            value = {
                val text =
                    feeAmountData.secondary?.getFormatted() ?: feeAmountData.primary.getFormatted()
                subhead2_leah(text = text)
            }
        )
    }
}