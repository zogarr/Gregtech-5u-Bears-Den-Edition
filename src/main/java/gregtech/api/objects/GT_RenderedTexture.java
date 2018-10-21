package gregtech.api.objects;

import gregtech.api.enums.Dyes;
import gregtech.api.interfaces.IIconContainer;
import gregtech.api.interfaces.ITexture;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;

public class GT_RenderedTexture extends GT_Color implements ITexture {
    private final IIconContainer mIconContainer;
    private final boolean mAllowAlpha;
    /**
     * DO NOT MANIPULATE THE MATERIALS_HASH_MAP INSIDE THIS ARRAY!!!
     * <p/>
     * Just set this variable to another different Array instead.
     * Otherwise some colored things will get Problems.
     */
    public GT_Color mRGBa = new GT_Color();

    public GT_RenderedTexture(IIconContainer aIcon, short[] aRGBa, boolean aAllowAlpha) {
        super();
        if (aRGBa.length != 4) throw new IllegalArgumentException("RGBa doesn't have 4 Values @ GT_RenderedTexture");
        mIconContainer = aIcon;
        mAllowAlpha = aAllowAlpha;
        mRGBa.setRGBA(aRGBa);
    }

    public GT_RenderedTexture(IIconContainer aIcon, short[] aRGBa) {
        this(aIcon, aRGBa, true);
    }

    public GT_RenderedTexture(IIconContainer aIcon) {
        this(aIcon, Dyes._NULL.getRGBa());
    }

    @Override
    public void renderXPos(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 0.6F), (int) (mRGBa.getGreen() * 0.6F), (int) (mRGBa.getBlue() * 0.6F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        aRenderer.renderFaceXPos(aBlock, aX, aY, aZ, mIconContainer.getIcon());
        if (mIconContainer.getOverlayIcon() != null) {
            Tessellator.instance.setColorRGBA(153, 153, 153, 255);
            aRenderer.renderFaceXPos(aBlock, aX, aY, aZ, mIconContainer.getOverlayIcon());
        }
    }

    @Override
    public void renderXNeg(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 0.6F), (int) (mRGBa.getGreen() * 0.6F), (int) (mRGBa.getBlue() * 0.6F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        aRenderer.renderFaceXNeg(aBlock, aX, aY, aZ, mIconContainer.getIcon());
        if (mIconContainer.getOverlayIcon() != null) {
            Tessellator.instance.setColorRGBA(153, 153, 153, 255);
            aRenderer.renderFaceXNeg(aBlock, aX, aY, aZ, mIconContainer.getOverlayIcon());
        }
    }

    @Override
    public void renderYPos(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 1.0F), (int) (mRGBa.getGreen() * 1.0F), (int) (mRGBa.getBlue() * 1.0F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        aRenderer.renderFaceYPos(aBlock, aX, aY, aZ, mIconContainer.getIcon());
        if (mIconContainer.getOverlayIcon() != null) {
            Tessellator.instance.setColorRGBA(255, 255, 255, 255);
            aRenderer.renderFaceYPos(aBlock, aX, aY, aZ, mIconContainer.getOverlayIcon());
        }
    }

    @Override
    public void renderYNeg(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 0.5F), (int) (mRGBa.getGreen() * 0.5F), (int) (mRGBa.getBlue() * 0.5F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        IIcon aIcon = mIconContainer.getIcon();

        double d3 = aIcon.getInterpolatedU(aRenderer.renderMaxX * 16.0D);
        double d4 = aIcon.getInterpolatedU(aRenderer.renderMinX * 16.0D);
        double d5 = aIcon.getInterpolatedV(aRenderer.renderMinZ * 16.0D);
        double d6 = aIcon.getInterpolatedV(aRenderer.renderMaxZ * 16.0D);

        if (aRenderer.renderMinX < 0.0D || aRenderer.renderMaxX > 1.0D) {
            d3 = aIcon.getMaxU();
            d4 = aIcon.getMinU();
        }

        if (aRenderer.renderMinZ < 0.0D || aRenderer.renderMaxZ > 1.0D) {
            d5 = aIcon.getMinV();
            d6 = aIcon.getMaxV();
        }

        double d11 = aX + aRenderer.renderMinX;
        double d12 = aX + aRenderer.renderMaxX;
        double d13 = aY + aRenderer.renderMinY;
        double d14 = aZ + aRenderer.renderMinZ;
        double d15 = aZ + aRenderer.renderMaxZ;

        Tessellator.instance.addVertexWithUV(d11, d13, d15, d3, d6);
        Tessellator.instance.addVertexWithUV(d11, d13, d14, d3, d5);
        Tessellator.instance.addVertexWithUV(d12, d13, d14, d4, d5);
        Tessellator.instance.addVertexWithUV(d12, d13, d15, d4, d6);

        if ((aIcon = mIconContainer.getOverlayIcon()) != null) {
            Tessellator.instance.setColorRGBA(128, 128, 128, 255);

            Tessellator.instance.addVertexWithUV(d11, d13, d15, d3, d6);
            Tessellator.instance.addVertexWithUV(d11, d13, d14, d3, d5);
            Tessellator.instance.addVertexWithUV(d12, d13, d14, d4, d5);
            Tessellator.instance.addVertexWithUV(d12, d13, d15, d4, d6);
        }
    }

    @Override
    public void renderZPos(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 0.8F), (int) (mRGBa.getGreen() * 0.8F), (int) (mRGBa.getBlue() * 0.8F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        aRenderer.renderFaceZPos(aBlock, aX, aY, aZ, mIconContainer.getIcon());
        if (mIconContainer.getOverlayIcon() != null) {
            Tessellator.instance.setColorRGBA(204, 204, 204, 255);
            aRenderer.renderFaceZPos(aBlock, aX, aY, aZ, mIconContainer.getOverlayIcon());
        }
    }

    @Override
    public void renderZNeg(RenderBlocks aRenderer, Block aBlock, int aX, int aY, int aZ) {
        Tessellator.instance.setColorRGBA((int) (mRGBa.getRed() * 0.8F), (int) (mRGBa.getGreen() * 0.8F), (int) (mRGBa.getBlue() * 0.8F), mAllowAlpha ? 255 - mRGBa.getAlpha() : 255);
        aRenderer.renderFaceZNeg(aBlock, aX, aY, aZ, mIconContainer.getIcon());
        if (mIconContainer.getOverlayIcon() != null) {
            Tessellator.instance.setColorRGBA(204, 204, 204, 255);
            aRenderer.renderFaceZNeg(aBlock, aX, aY, aZ, mIconContainer.getOverlayIcon());
        }
    }

    @Override
    public boolean isValidTexture() {
        return mIconContainer != null;
    }
}