package abstractFactoryAndSingleton.textures;

import abstractFactoryAndSingleton.textures.RendererTexture;

public class RendererTexturesOpenGL implements RendererTexture {

    @Override
    public void render() {
        System.out.println("Rendering textures with OpenGL");
    }
}
