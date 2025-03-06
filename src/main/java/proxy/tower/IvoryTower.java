package proxy.tower;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IvoryTower implements WizardTower{

  @Override
  public void enter(Wizard wizard) {
    log.info("{} enter the tower.", wizard);
  }
}
