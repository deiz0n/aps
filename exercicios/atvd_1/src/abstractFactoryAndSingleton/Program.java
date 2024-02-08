package abstractFactoryAndSingleton;

import abstractFactoryAndSingleton.factories.DirectXFactory;
import abstractFactoryAndSingleton.factories.OpenGLFactory;
import abstractFactoryAndSingleton.factories.RendererFactory;
import abstractFactoryAndSingleton.shadows.RendererShadows;
import abstractFactoryAndSingleton.textures.RendererTexture;

public class Program {

    private RendererTexture rendererTexture;
    private RendererShadows rendererShadows;

    public Program(RendererFactory factory) {
        rendererTexture = factory.createRendererTexture();
        rendererShadows = factory.createRendererShadows();
    }

    public void execute() {
        rendererTexture.render();
        rendererShadows.render();
    }

    public static void main(String[] args) {
        var programOpenGL = new Program(OpenGLFactory.getInstance());
        programOpenGL.execute();

        var programDirectX = new Program(DirectXFactory.getInstance());
        programDirectX.execute();
    }

}
