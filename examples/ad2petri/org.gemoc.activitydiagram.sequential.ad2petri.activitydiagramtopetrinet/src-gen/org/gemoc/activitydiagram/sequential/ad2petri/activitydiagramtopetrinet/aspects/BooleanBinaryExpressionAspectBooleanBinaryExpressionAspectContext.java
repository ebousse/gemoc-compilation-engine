package org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects;

import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression;
import java.util.Map;
import org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext {
  public final static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext INSTANCE = new BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectContext();
  
  public static BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties getSelf(final BooleanBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.activitydiagram.BooleanBinaryExpression, org.gemoc.activitydiagram.sequential.ad2petri.activitydiagramtopetrinet.aspects.BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties>();
  
  public Map<BooleanBinaryExpression, BooleanBinaryExpressionAspectBooleanBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
