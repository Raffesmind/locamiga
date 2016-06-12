package locamiga.com.br.locamiga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mastercard.masterpass.core.MasterPassAddress;
import com.mastercard.masterpass.core.MasterPassException;
import com.mastercard.masterpass.core.MasterPassWallet;
import com.mastercard.masterpass.core.TransactionRequest;
import com.mastercard.masterpass.mc.walletprovider.DefaultPINBasedWalletIntegration;
import com.mastercard.masterpass.wallet.MasterPass;
import com.mastercard.masterpass.wallet.MasterPassWalletConfig;
import com.mastercard.masterpass.wallet.WalletServiceCallback;
import com.mastercard.masterpass.wallet.request.AuthorizedCheckout;

import java.util.Locale;

public class pagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

    }
}
