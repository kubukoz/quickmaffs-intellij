package qmf;

import com.intellij.openapi.application.PreloadingActivity;
import org.wso2.lsp4intellij.IntellijLanguageClient;
import org.wso2.lsp4intellij.client.languageserver.serverdefinition.RawCommandServerDefinition;

class MyPreloadingActivity extends PreloadingActivity {
    @Override
    public void preload() {
        IntellijLanguageClient.addServerDefinition(
                new RawCommandServerDefinition("qmf",
                        new String[]{"/Users/kubukoz/projects/quickmaffs/bin/lsp"}
                )
                );

    }
    }
