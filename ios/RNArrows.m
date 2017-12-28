
#import "RNArrows.h"

@implementation RNArrows

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(createArrow)
{
  RCTLogInfo(@"Creating an arrow!");
}

RCT_EXPORT_MODULE()

@end
  