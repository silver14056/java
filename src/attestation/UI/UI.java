package attestation.UI;

import attestation.Core.CommandScan;
import attestation.Core.Switcher;


public class UI {

    public void run() {
        boolean flag = true;
        Menu menu = new Menu();
        CommandScan commandScan = new CommandScan();
        Switcher switcher = new Switcher();

        while (flag) {
            menu.mainMenu();
            flag = switcher.sixPoints(commandScan.cs(6));
        }
    }
}
