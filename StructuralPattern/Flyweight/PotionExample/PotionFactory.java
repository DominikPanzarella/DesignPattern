package StructuralPattern.Flyweight.PotionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PotionFactory
{
    private final Map<Class<?>,Potion> potions;

    public PotionFactory()
    {
        potions = new HashMap<>();
    }

    public Potion createPotion(Class<? extends Potion> type) {
        var potion = potions.get(type);
        if( potion == null ){
            potion = getInstance(type);
            potions.put(type,potion);
        }
        return potion;
    }

    public <T extends Potion> T getInstance(Class<T> type){
        T potion;
        try
        {
            Constructor<T> ctr = type.getConstructor();
            return (T)ctr.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }



}
