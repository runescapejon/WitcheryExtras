package alkalus.main.core.recipe;

import alkalus.main.core.WitcheryExtras;
import alkalus.main.core.crafting.OvenRecipes;
import alkalus.main.core.recipe.fixes.GarlicRecipes;

public class CustomRecipeLoader {

	public CustomRecipeLoader() {
		run();
	}
	
	private final void run() {
		WitcheryExtras.log(0, "Running Custom Recipe Loader.");
		
		//Fixes recipes that hardcode Witchery Garlic types.
		new GarlicRecipes();
		OvenRecipes.instance().generateDefaultOvenRecipes();
		
	}

	
	
}
