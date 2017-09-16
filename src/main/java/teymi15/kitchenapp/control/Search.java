package teymi15.assignment1.control;

import java.util.ArrayList;

public class Search {
    private ArrayList recipes = new ArrayList();
    private ArrayList ingredients = new ArrayList();

    public ArrayList searchRecipeByName(String name){
        ArrayList found = new ArrayList();
        for(Object x : recipes){
            if(x.equals(name)) found.add(x);
        }
        return found;
    }
    public ArrayList searchRecipeByCuisine(String Cuisine){
        ArrayList found = new ArrayList();

        return found;
    }
    public ArrayList searchRecipeByPrimaryIngredient(String ingredient) {
        ArrayList found = new ArrayList();

        return found;
    }
    public ArrayList searchRecipeByType(String type){
        ArrayList found = new ArrayList();

        return found;
    }
    public ArrayList searchhAll(String search){
        ArrayList a = searchRecipeByName(search);
        ArrayList b = searchRecipeByCuisine(search);
        ArrayList c = searchRecipeByPrimaryIngredient(search);
        ArrayList d = searchRecipeByType(search);
        for(Object x : b){
            if(a.contains(x)) a.add(x);
        }
        for(Object x : c){
            if(a.contains(x)) a.add(x);
        }
        for(Object x : d){
            if(a.contains(x)) a.add(x);
        }
        return a;
    }
}
