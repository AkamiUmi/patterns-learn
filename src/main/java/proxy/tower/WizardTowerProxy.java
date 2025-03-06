package proxy.tower;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WizardTowerProxy implements WizardTower{
  private static final int MAX_ALLOWED_WIZARDS = 3;
  private int numWizards;
  private final WizardTower wizardTower;

  public WizardTowerProxy (WizardTower wizardTower) {
    this.wizardTower = wizardTower;
  }
  @Override
  public void enter(Wizard wizard) {
    if (numWizards < MAX_ALLOWED_WIZARDS) {
      wizardTower.enter(wizard);
      numWizards++;
    } else {
      log.info("{} is not allowed to enter.", wizard);
    }
  }
}
