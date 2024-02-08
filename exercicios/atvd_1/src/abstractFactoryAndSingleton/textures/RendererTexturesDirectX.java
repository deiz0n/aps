package abstractFactoryAndSingleton.textures;

import abstractFactoryAndSingleton.textures.RendererTexture;

public class RendererTexturesDirectX implements RendererTexture {

    @Override
    public void render() {
        System.out.println("Rendering textures with DirectX" +
                "");
    }
}
