package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectProperties;

@SuppressWarnings("all")
public class IntegerVariableAspectIntegerVariableAspectContext {
  public final static IntegerVariableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariableAspectIntegerVariableAspectContext();
  
  public static IntegerVariableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.IntegerVariable, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.IntegerVariableAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
