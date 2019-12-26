package daddy.devmas.dutility;

import daddy.devmas.dutility.files.Files;
import daddy.devmas.dutility.messages.MessageUtil;
import org.bukkit.plugin.java.JavaPlugin;

public final class DUtility extends JavaPlugin {

    //- Plugin Instance
    private static DUtility dUtility;
    public static DUtility getInstance() { return dUtility; }

    @Override
    public void onEnable() {

        //- Plugin Instance
        dUtility = this;

        //- Files
        files = new Files(this);
        messageUtil = new MessageUtil(this);
    }

    @Override
    public void onDisable() {

        files = null;
        messageUtil = null;

        //Plugin Instance
        dUtility = null;
    }

    //- Files
    private Files files;
    public Files getFiles() {
        return files;
    }

    //- Messages
    private MessageUtil messageUtil;
    public MessageUtil getMessageUtil() {
        return messageUtil;
    }

}