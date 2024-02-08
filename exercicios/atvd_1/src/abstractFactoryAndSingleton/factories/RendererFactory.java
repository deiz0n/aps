package abstractFactoryAndSingleton.factories;

import abstractFactoryAndSingleton.shadows.RendererShadows;
import abstractFactoryAndSingleton.textures.RendererTexture;

public interface RendererFactory {

    RendererTexture createRendererTexture();
    RendererShadows createRendererShadows();

}
