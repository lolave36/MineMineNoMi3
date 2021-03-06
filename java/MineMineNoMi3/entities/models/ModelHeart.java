package MineMineNoMi3.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHeart extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
  
  public ModelHeart()
  {
    textureWidth = 64;
    textureHeight = 32;
    
    Shape1 = new ModelRenderer(this, 0, 0);
    Shape1.addBox(-3F, -1F, 0F, 1, 2, 1);
    Shape1.setRotationPoint(0F, 0F, 0F);
    Shape1.setTextureSize(64, 32);
    Shape1.mirror = true;
    setRotation(Shape1, 3.14159F, 1.570796F, 0F);
    Shape2 = new ModelRenderer(this, 0, 0);
    Shape2.addBox(-2F, 1F, 0F, 1, 2, 1);
    Shape2.setRotationPoint(0F, 0F, 0F);
    Shape2.setTextureSize(64, 32);
    Shape2.mirror = true;
    setRotation(Shape2, 3.14159F, 1.570796F, 0F);
    Shape3 = new ModelRenderer(this, 0, 0);
    Shape3.addBox(-1F, 3F, 0F, 1, 1, 1);
    Shape3.setRotationPoint(0F, 0F, 0F);
    Shape3.setTextureSize(64, 32);
    Shape3.mirror = true;
    setRotation(Shape3, 3.14159F, 1.570796F, 0F);
    Shape4 = new ModelRenderer(this, 0, 0);
    Shape4.addBox(0F, 1F, 0F, 1, 2, 1);
    Shape4.setRotationPoint(0F, 0F, 0F);
    Shape4.setTextureSize(64, 32);
    Shape4.mirror = true;
    setRotation(Shape4, 3.14159F, 1.570796F, 0F);
    Shape5 = new ModelRenderer(this, 0, 0);
    Shape5.addBox(1F, -1F, 0F, 1, 2, 1);
    Shape5.setRotationPoint(0F, 0F, 0F);
    Shape5.setTextureSize(64, 32);
    Shape5.mirror = true;
    setRotation(Shape5, 3.14159F, 1.570796F, 0F);
    Shape6 = new ModelRenderer(this, 0, 0);
    Shape6.addBox(-2F, -2F, 0F, 1, 1, 1);
    Shape6.setRotationPoint(0F, 0F, 0F);
    Shape6.setTextureSize(64, 32);
    Shape6.mirror = true;
    setRotation(Shape6, 3.14159F, 1.570796F, 0F);
    Shape7 = new ModelRenderer(this, 0, 0);
    Shape7.addBox(-1F, -1F, 0F, 1, 1, 1);
    Shape7.setRotationPoint(0F, 0F, 0F);
    Shape7.setTextureSize(64, 32);
    Shape7.mirror = true;
    setRotation(Shape7, 3.14159F, 1.570796F, 0F);
    Shape8 = new ModelRenderer(this, 0, 0);
    Shape8.addBox(0F, -2F, 0F, 1, 1, 1);
    Shape8.setRotationPoint(0F, 0F, 0F);
    Shape8.setTextureSize(64, 32);
    Shape8.mirror = true;
    setRotation(Shape8, 3.14159F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}
