package com.finzsoft.sovse.occ.cucumber;

import com.finzsoft.sovse.occ.rest.JsonapiRestassured;

public abstract class AbstractSteps {

  protected static JsonapiRestassured REST;

  public abstract void initRestassuredContext();

}
