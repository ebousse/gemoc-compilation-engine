package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.activitydiagram;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerValue;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory;

@SuppressWarnings("all")
public class IntegerValueAdapter extends EObjectAdapter<IntegerValue> implements activitydiagram.IntegerValue {
  private ActivityDiagramMTAdaptersFactory adaptersFactory;
  
  public IntegerValueAdapter() {
    super(org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.adapters.activitydiagrammt.ActivityDiagramMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return activitydiagram.ActivitydiagramPackage.eINSTANCE.getIntegerValue();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.INTEGER_VALUE__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.INTEGER_VALUE__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case activitydiagram.ActivitydiagramPackage.INTEGER_VALUE__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
