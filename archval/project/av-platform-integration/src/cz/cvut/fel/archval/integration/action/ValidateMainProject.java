package cz.cvut.fel.archval.integration.action;

import cz.cvut.fel.archval.core.api.ValidationModelIface;
import cz.cvut.fel.archval.integration.avd.AvdCookie;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public final class ValidateMainProject implements ActionListener {

    private final AvdCookie avdCookie;

    public ValidateMainProject(AvdCookie context) {
        this.avdCookie = context;
    }

    public void actionPerformed(ActionEvent ev) {
        ValidationModelIface validationModel = avdCookie.getValidationModel();
    }
}
