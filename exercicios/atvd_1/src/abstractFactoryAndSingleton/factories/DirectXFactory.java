package abstractFactoryAndSingleton.factories;

import abstractFactoryAndSingleton.shadows.RendererShadows;
import abstractFactoryAndSingleton.shadows.RendererShadowsDirectX;
import abstractFactoryAndSingleton.textures.RendererTexture;
import abstractFactoryAndSingleton.textures.RendererTexturesDirectX;

public class DirectXFactory implements RendererFactory {

    private static DirectXFactory instance;

    private DirectXFactory() {
    }

    public static  synchronized DirectXFactory getInstance() {
        if (instance == null) instance = new DirectXFactory();
        return instance;
    }

    @Override
    public RendererTexture createRendererTexture() {
        return new RendererTexturesDirectX();
    }

    @Override
    public RendererShadows createRendererShadows() {
        return new RendererShadowsDirectX();
    }
}
