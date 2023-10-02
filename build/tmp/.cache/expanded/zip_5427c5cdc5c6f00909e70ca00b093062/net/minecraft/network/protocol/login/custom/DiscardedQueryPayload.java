package net.minecraft.network.protocol.login.custom;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public record DiscardedQueryPayload(ResourceLocation id, @org.jetbrains.annotations.Nullable FriendlyByteBuf data) implements CustomQueryPayload {
   public DiscardedQueryPayload(ResourceLocation id) {
      this(id, null);
   }

   public void write(FriendlyByteBuf p_299949_) {
      if (this.data != null)
         p_299949_.writeBytes(this.data.slice());
   }

   public ResourceLocation id() {
      return this.id;
   }
}
