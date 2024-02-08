package abstractFactoryAndSingleton.factories;

import abstractFactoryAndSingleton.shadows.RendererShadows;
import abstractFactoryAndSingleton.shadows.RendererShadowsOpenGL;
import abstractFactoryAndSingleton.textures.RendererTexture;
import abstractFactoryAndSingleton.textures.RendererTexturesOpenGL;

public class OpenGLFactory implements RendererFactory {

    private static OpenGLFactory instance;

    private OpenGLFactory() {
    }

    public static synchronized OpenGLFactory getInstance() {
        if (instance == null) instance = new OpenGLFactory();
        return instance;
    }

    @Override
    public RendererTexture createRendererTexture() {
        return new RendererTexturesOpenGL();
    }

    @Override
    public RendererShadows createRendererShadows() {
        return new RendererShadowsOpenGL();
    }
}
