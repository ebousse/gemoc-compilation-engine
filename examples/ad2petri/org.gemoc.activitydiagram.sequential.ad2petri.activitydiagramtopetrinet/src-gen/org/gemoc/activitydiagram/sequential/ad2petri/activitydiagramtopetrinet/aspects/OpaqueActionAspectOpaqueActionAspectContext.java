package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OpaqueActionAspectOpaqueActionAspectProperties;

@SuppressWarnings("all")
public class OpaqueActionAspectOpaqueActionAspectContext {
  public final static OpaqueActionAspectOpaqueActionAspectContext INSTANCE = new OpaqueActionAspectOpaqueActionAspectContext();
  
  public static OpaqueActionAspectOpaqueActionAspectProperties getSelf(final OpaqueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OpaqueActionAspectOpaqueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.OpaqueAction, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.OpaqueActionAspectOpaqueActionAspectProperties>();
  
  public Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> getMap() {
    return map;
  }
}
