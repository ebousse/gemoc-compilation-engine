package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectProperties;

@SuppressWarnings("all")
public class BooleanVariableAspectBooleanVariableAspectContext {
  public final static BooleanVariableAspectBooleanVariableAspectContext INSTANCE = new BooleanVariableAspectBooleanVariableAspectContext();
  
  public static BooleanVariableAspectBooleanVariableAspectProperties getSelf(final BooleanVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanVariable, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanVariableAspectBooleanVariableAspectProperties>();
  
  public Map<BooleanVariable, BooleanVariableAspectBooleanVariableAspectProperties> getMap() {
    return map;
  }
}
