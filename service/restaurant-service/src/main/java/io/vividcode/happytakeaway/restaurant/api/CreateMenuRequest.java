package io.vividcode.happytakeaway.restaurant.api;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class CreateMenuRequest {

  @NonNull private String restaurantId;
  @NonNull private String name;
  private boolean current;
}
