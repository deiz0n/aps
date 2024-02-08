package abstractFactoryAndSingleton.shadows;

import abstractFactoryAndSingleton.shadows.RendererShadows;

public class RendererShadowsOpenGL implements RendererShadows {

    @Override
    public void render() {
        System.out.println("Rendering shadows with OpenGL");
    }
}
